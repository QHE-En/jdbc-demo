package com.qiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
    private static final String url ="jdbc:mysql://localhost:3306/qhe?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8&allowPublicKeyRetrieval=true";
    private static final String username= "root";
    private static final String password = "123456";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
//      如果别人调用 JdbcUtil.getConnection()，就能拿到一个连好的数据库连接。
    }
    public static void close(ResultSet rs, PreparedStatement stmt,Connection conn){
        try{
            if(rs!=null)
                rs.close();
            if (stmt!=null)
                stmt.close();
            if (conn!=null)
                conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
