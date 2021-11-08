package com.linkuan.springbootjdbcstart.generator.mapper;

import com.linkuan.springbootjdbcstart.generator.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity com.linkuan.springbootjdbcstart.generator.domain.User
*/
@Mapper
public interface UserMapper {

    List<User> selectAll();

    Integer insert(User user);

    Integer update(User user);

    Integer deleteById(@Param("id") Long id);
}
