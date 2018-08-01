# MiniSQL

#### 基于MySQL语法的小型数据库

- 语言：Java

- 环境：IDEA Ultimate 2017.3

#### Interpreter : 

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

  

#### NOTICE：

- 所有命令中涉及到字符串值的两端需为单引号。
- 建表命令中主键（Primary key）只能有一个，唯一键（Unique key）可以有若干个。
- 建表时类型后不需要加最大显示宽度。
- MiniSQL不区分char和varchar，char进行检索时删除尾部空格。
- MiniSQL默认每个字段均可为NULL，若想设置为NOT NULL，需要在建表时声明。