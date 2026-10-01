//声明包名：package com.qiu
//定义类，类名必须和文件名一致 public class TestJdbc
//程序入口 public static void main(String[] args)
//公开的  public
//静态的，不用 new 对象就能跑 static
//没有返回值 void
//方法名，Java 规定入口必须叫 main
//参数，接收命令行参数 String[] args
//声明可能抛异常，做数据库操作时必须加 throws Exception
package com.qiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbc {
    public static void main(String[] args) throws Exception {
        //1、加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、建联系（url username password）
        String url = "jdbc:mysql://localhost:3306/qhe?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url,username,password);
        //3、准备SQL
        String sql = "select * from user";
        PreparedStatement stmt = conn.prepareStatement(sql);
        //4、执行查询
        ResultSet rs =stmt.executeQuery();
        //5、遍历结果
        while (rs.next()){
            System.out.println("id："+rs.getInt("id")+" name："+rs.getString("name")+" age"+rs.getInt("age"));
        }
        //6、关闭连接
        rs.close();
        stmt.close();
        conn.close();
    }
}