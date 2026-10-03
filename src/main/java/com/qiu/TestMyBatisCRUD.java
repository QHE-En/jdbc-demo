package com.qiu;

import com.qiu.entity.User;
import com.qiu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestMyBatisCRUD {
   public static void main(String[] args) throws Exception{
       InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
       SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
       SqlSession session =factory.openSession();
       UserMapper userMapper= session.getMapper(UserMapper.class);
       //1、插入一个用户
       User newUser =new User();
       newUser.setName("王五");
       newUser.setAge(22);
       int insertResult=userMapper.insert(newUser);
       System.out.println("插入影响行数"+insertResult);
       //2、修改用户（把id=1的年龄改成30）
       User updateUser =new User();
       updateUser.setId(1);
       updateUser.setName("张三");
       updateUser.setAge(30);
       int updateResult=userMapper.update(updateUser);
       System.out.println("修改影响行数"+updateResult);
       //3、删除用户（删除id=2的李四）
       int deleteResult = userMapper.deleteById(2);
       System.out.println("删除影响行数"+deleteResult);
       //4、提交事务（增删改必须提交，否则不生效）
       session.commit();
       //5、关闭会话
       session.close();
    }
}
