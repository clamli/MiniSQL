package BufferManager;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BufferManager {
    // 一共20个内存块，每个块4096kb
    public static final int NUMOFBLOCKS = 20;
    private static String DIRECTORY = "Record/";
    public static Block blocks[] = new Block[NUMOFBLOCKS];
    public static int pointer = 0; // 利用block下标代替指针

    /**
     * 初始化BufferManager
     * @return void
     */
    public BufferManager() {
        for (int i = 0; i < NUMOFBLOCKS; i++) {
            blocks[i] = new Block();
        }
    }

    /**
     * 关闭程序时调用，将使用的块写回
     * 未使用的块和未修改的块不用写回
     */
    public void close() {
        for (int i = 0; i < NUMOFBLOCKS; i++) {
            writeToDisk(i);
        }
    }

    /**
     * 删除指定表文件
     * @param filename
     */
    public void dropBlock(String filename) {
        for (int i = 0; i < NUMOFBLOCKS; i++) {
            if (blocks[i].filename.equals(filename)) {
                blocks[i].isValid = false;
            }
        }
    }

    /**
     * 根据表名和块在表中的偏移，找到对应的块并返回，若表文件不存在，则返回空块；否则，从磁盘中读出对应块
     * @param filename
     * @param blockOffset
     * @return 得到的内存块
     */
    public Block getBlock(String filename, int blockOffset) {
        int num = findBlock(filename, blockOffset);
        if (num == -1) {
            num = getFreeBlock();
            File file = new File(DIRECTORY+filename);
            if (!file.exists()) {
                blocks[num].blockOffset = blockOffset;
                blocks[num].filename = filename;
                blocks[num].referenceBit = true;
                blocks[num].isEmpty = false;
            } else {
                readFromDisk(filename, blockOffset, num);
            }
        }
        return blocks[num];
    }

    /**
     * 根据表名和块偏移，找到内存中的对应块，如果找不到则返回-1
     * @param filename
     * @param blockOffset
     * @return 内存中的对应块/-1
     */
    private int findBlock(String filename, int blockOffset) {
        for (int i = 0; i < NUMOFBLOCKS; i++) {
            if (blocks[i].isValid && blocks[i].filename.equals(filename) && blocks[i].blockOffset == blockOffset) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 利用LRU算法找到空闲块，以时钟算法实现
     * @return 找到块的编号
     */
    private int getFreeBlock() {
        do {
            pointer = (pointer + 1) % NUMOFBLOCKS;
            if (blocks[pointer].referenceBit == true) {
                blocks[pointer].referenceBit = false;
            } else {
                writeToDisk(pointer);
                return pointer;
            }
        } while (true);
    }

    /**
     * 根据表名和块偏移，把表记录读取到buffer中下标num的块内
     * @param filename
     * @param blockOffset
     * @param num
     */
    private void readFromDisk(String filename, int blockOffset, int num) {
        File file = null;
        RandomAccessFile raf = null;
        blocks[num].filename = filename;
        blocks[num].blockOffset = blockOffset;
        blocks[num].referenceBit = true;
        blocks[num].isEmpty = false;
        try {
            file = new File(DIRECTORY+filename);
            raf = new RandomAccessFile(file, "rw");
            if (raf.length() >= blocks[num].blockOffset * Block.BLOCKSIZE + Block.BLOCKSIZE) {
                raf.seek(blockOffset * Block.BLOCKSIZE);
                raf.read(blocks[num].data, 0, Block.BLOCKSIZE);
            } else {
                raf.seek(blockOffset * Block.BLOCKSIZE);
                raf.read(blocks[num].data, 0, (int)(raf.length() - blocks[num].blockOffset * Block.BLOCKSIZE));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 给定块号，把块中内容写回磁盘，并把对应块重置
     * 未修改过的块不用写回
     * 未使用过的块不用写回
     * 被drop掉的表需要被删除表文件
     * @param num
     */
    private void writeToDisk(int num) {
        if (blocks[num].isValid == false) {
            File file = new File(DIRECTORY+blocks[num].filename);
            if (file.exists()) file.delete();
        }
        File file;
        RandomAccessFile raf = null;
        if (blocks[num].isEmpty == false && blocks[num].isDirty == true)  {
            try {
                file = new File(DIRECTORY+blocks[num].filename);
                raf = new RandomAccessFile(file, "rw");
                if (!file.exists()) {
                    file.createNewFile();
                }
                raf.seek(blocks[num].blockOffset * Block.BLOCKSIZE);
                raf.write(blocks[num].data);
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        blocks[num] = new Block();
    }
}
