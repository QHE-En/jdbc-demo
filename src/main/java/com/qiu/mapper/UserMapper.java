package com.qiu.mapper;

import com.qiu.entity.User;
import java.util.List;

public interface UserMapper {
    List<User> findAll();
}