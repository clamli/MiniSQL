# MiniSQL

### 基于MySQL语法的小型数据库

- 语言：Java

- 环境：IDEA Ultimate 2017.3

### 模块1、Interpreter :

基于Antlr v4，支持语法如下，

- SELECT : 

  ```
  SELECT 列名 FROM 表名 WHERE子句 ORDER BY子句
  ```

- DELETE : 

  ```
  DELETE FROM 表名 WHERE子句
  ```

- INSERT : 

  ```
  INSERT INTO 表名 (...) VALUES (...)
  ```

- UPDATE : 

  ```
  UPDATE 表名 SET x1=v1, x2=v2... WHERE子句
  ```

- CREATE DATABASE : 

  ```
  CREATE (DATABASE | SCHEMA) 数据库名
  ```

- DROP DATABASE : 

  ```
  DROP (DATABASE | SCHEMA) 数据库名
  ```

- CREATE TABLE : 

  ```
  CREATE TABLE 表名 (id1 type1, id2 type2, ..., primary key (id1), unique (id1, id2, ...))
  ```

- DROP TABLE : 

  ```
  DROP TABLE 表名
  ```

- CREATE INDEX : 

  ```
  CREATE UNIQUE INDEX 索引名 ON 表名 ( 列名1，列名2，... )
  ```

- DROP INDEX :

  ```
  DROP INDEX 索引名 ON 表名
  ```

- EXIT ：

  ```
  EXIT
  ```

### 模块2、Catalog Manager :

### 模块3、Record Manager :

- order by 暂未实现

### 模块4、Buffer Manager :

- 缓存淘汰算法（LRU，利用时钟算法实现）

![时钟算法](https://github.com/clamli/MiniSQL/blob/master/image-folder/%E6%97%B6%E9%92%9F%E7%AE%97%E6%B3%95.png)

如上图所示，当使用到某一块时，就把块对应的reference_bit位置true，当随机抽取到某块时，若该块的reference_bit位为true，则将其置false，继续寻找目标块；若该块的reference_bit位为false，则该块即为目标块。

代码示例：

```
do {
	pointer = (pointer + 1) % NUMOFBLOCKS;
	if (blocks[pointer].reference_bit == true) {
        	blocks[pointer].reference_bit = false;
	}
	else if (blocks[pointer].reference_bit == false) {
		return pointer;
	}
} while (true);
```



### NOTICE：

- 所有命令中涉及到字符串值的两端需为单引号。

- 命令行语句分号可加可不加，命令大小写随意。

- 建表命令中主键（Primary key）只能有一个，唯一键（Unique key）可以有若干个。

- 建表时类型后不需要加最大显示宽度。

- MiniSQL不区分char和varchar，char进行检索时删除尾部空格。

- MiniSQL中的char占一个字节。

- MiniSQL默认每个字段均可为NULL，若想设置为NOT NULL，需要在建表时声明。

- 为了区分NULL值，在int类型中，取int类型的最大值作为NULL值；在float类型中，取float类型的最大值作为NULL值；在string类型中，取string字符串"$$$"（'$'个数以字符串长度来定）作为NULL值。

  
