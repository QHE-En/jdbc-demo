# jdbc-demo

从零学 Java 后端，第一个项目：JDBC 连接 MySQL。

## 技术栈
- Java 25
- MySQL 8
- JDBC
- Maven

## 功能
- 用 JDBC 连接 MySQL 数据库
- 查询 user 表数据并打印
- 封装 JdbcUtil 工具类（获取连接、关闭资源）

## 怎么运行
1. 本地装好 MySQL，建数据库 qhe，建表 user
2. 改 JdbcUtil.java 里的数据库密码
3. 运行 TestJdbc.java

## 踩过的坑
- JAVA_HOME 没设，Maven 找不到 JDK
- IDEA 的 JDK 路径配错
- Maven 项目没生成 src，要手动建
