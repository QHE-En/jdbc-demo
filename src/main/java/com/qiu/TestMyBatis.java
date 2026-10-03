package com.qiu;

import com.qiu.entity.User;
import com.qiu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    public static void main(String[] args) throws Exception {
        // 1. 读取 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2. 创建 SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3. 打开 SqlSession
        SqlSession session = factory.openSession();

        // 4. 拿到 UserMapper 接口
        UserMapper userMapper = session.getMapper(UserMapper.class);

        // 5. 调用接口方法，查所有用户
        List<User> userList = userMapper.findAll();

        // 6. 遍历打印
        for (User user : userList) {
            System.out.println("id: " + user.getId() + ", name: " + user.getName() + ", age: " + user.getAge());
        }

        // 7. 关闭 SqlSession
        session.close();
    }
}
