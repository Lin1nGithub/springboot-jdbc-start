package com.linkuan.springbootjdbcstart.generator.service.impl;

import com.linkuan.springbootjdbcstart.generator.domain.User;
import com.linkuan.springbootjdbcstart.generator.service.UserService;
import com.linkuan.springbootjdbcstart.generator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }

    @Override
    public Integer deleteById(Long id) {
        return userMapper.deleteById(id);
    }
}
