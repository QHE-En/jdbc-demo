# jdbc-demo

从零学 Java 后端，记录 JDBC 和 MyBatis 的学习过程。

## 技术栈

- Java 25
- MySQL 8
- JDBC
- MyBatis
- Maven

## 功能

- 用 JDBC 连接 MySQL，查询 user 表数据
- 封装 JdbcUtil 工具类（获取连接、关闭资源）
- 用 MyBatis 重写查询，代码从 30 行简化到 7 行
- MyBatis 增删改查（insert、update、deleteById、findAll）

## 项目结构

## 怎么运行

1. 本地装好 MySQL，建数据库 `qhe`，建表 `user`
2. 改 `mybatis-config.xml` 里的数据库密码
3. 运行 `TestJdbc.java`（JDBC 版）或 `TestMyBatis.java`（MyBatis 版）

## 踩过的坑

- JAVA_HOME 没设，Maven 找不到 JDK
- IDEA 的 JDK 路径配错，报 `Cannot run program`
- Maven 依赖下载失败，清缓存 + 重启解决
- Push 被拒，先 Pull 再 Push
- `parameterType` 写错包名，应该是 `java.lang.Integer`
- 接口方法名和 XML 的 id 对不上，报 `Invalid bound statement`

## 学习进度

- [x] JDBC 连接 MySQL
- [x] 封装 JdbcUtil 工具类
- [x] MyBatis 查询
- [x] MyBatis 增删改
- [ ] SpringBoot
- [ ] Vue
- [ ] AI 应用开发
