package com.linkuan.springbootjdbcstart.controller;

import com.linkuan.springbootjdbcstart.generator.domain.User;
import com.linkuan.springbootjdbcstart.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linkuan
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select/all")
    List<User> selectAll() {
        return userService.selectAll();
    }

    @PostMapping("/insert")
    Integer insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @PostMapping("/update")
    Integer update(@RequestBody User user) {
        return userService.update(user);
    }

    @GetMapping("/deleteById")
    Integer deleteBy(@RequestParam("id") Long id) {
        return userService.deleteById(id);
    }
}
