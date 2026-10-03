package com.qiu.mapper;

import com.qiu.entity.User;
import java.util.List;

public interface UserMapper {
    List<User> findAll();
    int insert(User user);
    int update(User user);
    int deleteById(Integer id);
}