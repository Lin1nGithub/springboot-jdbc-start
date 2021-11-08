package com.linkuan.springbootjdbcstart.generator.service;

import com.linkuan.springbootjdbcstart.generator.domain.User;

import java.util.List;

/**
*
*/
public interface UserService {

    List<User> selectAll();

    Integer insert(User user);

    Integer update(User user);

    Integer deleteById(Long id);
}
