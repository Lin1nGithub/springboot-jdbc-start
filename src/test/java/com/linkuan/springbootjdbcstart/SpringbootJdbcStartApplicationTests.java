package com.linkuan.springbootjdbcstart;

import com.alibaba.fastjson.JSONObject;
import com.linkuan.springbootjdbcstart.generator.domain.User;
import com.linkuan.springbootjdbcstart.generator.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class SpringbootJdbcStartApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testInsert() {
        User user = User.builder()
                .name("linkuan")
                .phone("1234567")
                .build();

        userService.insert(user);
        log.info("insert User : {}" , JSONObject.toJSONString(user));
    }

    @Test
    void testSelectAll() {
        List<User> users = userService.selectAll();
        log.info("selectAll :{}", JSONObject.toJSONString(users));
    }

    @Test
    void testUpdate() {
        User user = User.builder()
                .name("wanghong")
                .phone("12345")
                .id(1L)
                .build();

        userService.update(user);

        log.info("update User : {}" , JSONObject.toJSONString(user));
    }

    @Test
    void testDelete() {
        userService.deleteById(1L);
    }

}
