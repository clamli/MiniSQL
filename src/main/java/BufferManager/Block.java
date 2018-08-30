package BufferManager;

import java.io.*;

public class Block {
    public static final int BLOCKSIZE = 4096;      // 块大小4096个字节
    public boolean isEmpty = true;    // 标记当前块是否为空（即是否未使用）
    public boolean isValid = true;    // 标记当前块内容是否有效（即是否被drop）
    public byte[] data = new byte[BLOCKSIZE];          // 4kb大小的数据区
    public String filename = "";      // 块所属文件名
    public int blockOffset = 0;      // 当前块属于该文件的第几个块
    public boolean isDirty = false;      // 标记是否为脏数据
    public boolean referenceBit = false;       // 引用位，用于LRU算法

    /**
     * 读出4kb数据，并将引用位置1
     * @return
     */
    public byte[] readData() {
        referenceBit = true;
        return data;
    }

    /**
     * 将数据写入块中
     * @param byteOffset 写入数据在块中偏移
     * @param inputData 写入的数据
     * @param size 写入数据大小
     * @return 写入数据是否成功
     */
    public boolean writeData(int byteOffset, byte inputData[], int size) {
        if (byteOffset + size >= BLOCKSIZE) return false;
        for (int i = 0; i < size; i++) {
            data[i+byteOffset] = inputData[i];
        }
        isDirty = true;
        referenceBit = true;
        return true;
    }

    /**
     * 从data指定位置读出整数
     * @param offset
     * @return 读出的int值
     */
    public int readInt(int offset) {
        byte[] temp = new byte[4];
        temp[0] = data[offset + 0];
        temp[1] = data[offset + 1];
        temp[2] = data[offset + 2];
        temp[3] = data[offset + 3];
        ByteArrayInputStream bInput = new ByteArrayInputStream(temp);
        DataInputStream dIutput = new DataInputStream(bInput);
        int intValue = 0;
        try {
            intValue = dIutput.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        referenceBit = true;
        return intValue;
    }

    /**
     * 往块中指定位置写入整数
     * @param offset
     * @param num
     */
    public void writeInt(int offset, int num) {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
        DataOutputStream dOutput = new DataOutputStream(bOutput);
        try {
            dOutput.writeInt(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] temp = bOutput.toByteArray();
        data[offset + 0] = temp[0];
        data[offset + 1] = temp[1];
        data[offset + 2] = temp[2];
        data[offset + 3] = temp[3];
        isDirty = true;
        referenceBit = true;
    }

    /**
     * 从data指定位置读出浮点数
     * @param offset
     * @return 读出的float值
     */
    public float readFloat(int offset) {
        byte[] temp = new byte[4];
        temp[0] = data[offset + 0];
        temp[1] = data[offset + 1];
        temp[2] = data[offset + 2];
        temp[3] = data[offset + 3];
        ByteArrayInputStream bInput = new ByteArrayInputStream(temp);
        DataInputStream dIutput = new DataInputStream(bInput);
        float floatValue = 0;
        try {
            floatValue = dIutput.readFloat();
        } catch (IOException e) {
            e.printStackTrace();
        }
        referenceBit = true;
        return floatValue;
    }

    /**
     * 往块中指定位置写入浮点数
     * @param offset
     * @param num
     */
    public void writeFloat(int offset, float num) {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
        DataOutputStream dOutput = new DataOutputStream(bOutput);
        try {
            dOutput.writeFloat(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] temp = bOutput.toByteArray();
        data[offset + 0] = temp[0];
        data[offset + 1] = temp[1];
        data[offset + 2] = temp[2];
        data[offset + 3] = temp[3];
        isDirty = true;
        referenceBit = true;
    }

    /**
     * 从指定位置读出长度为length的字符串，由于字符串是定长存储，长度不足处会用'#'补足
     * 因此读出时需要将'#'去除
     * @param offset
     * @param length: 字符串的指定长度
     * @return 取出的字符串
     */
    public String readString(int offset, int length) {
        byte[] buf = new byte[length];
        for (int i = 0; i < length; i++) {
            buf[i] = data[offset++];
        }
        String strValue = new String(buf);
        strValue = strValue.replace("#", "");
        referenceBit = true;
        return strValue;
    }

    /**
     * 往指定位置写入字符串
     * @param offset
     * @param str
     * @param length: 字符串的指定长度
     */
    public void writeString(int offset, String str, int length) {
        byte[] buf = str.getBytes();
        int j;
        for (j = 0; j < buf.length; j++) {
            data[offset++] = buf[j];
        }
//        for (; j < length; j++) {
//            data[offset++] = '#';
//        }
        isDirty = true;
        referenceBit = true;
    }


    public static void main(String args[]) {
        Block block = new Block();
        block.writeFloat(0, Float.MAX_VALUE);
        float num = block.readFloat(0);
        System.out.println(num == Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
