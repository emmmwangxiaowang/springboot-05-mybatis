package com.wang.controller;

import com.wang.mapper.userMapper;
import com.wang.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/10/6 0006
 */
@RestController
public class userController {
    @Autowired
    private userMapper userMapper;

    //url请求都是get
    @GetMapping("/queryUserList")
    public String queryUserList() {
        List<user> userList = userMapper.queryUserList();
        return userList.toString();
    }

    @GetMapping("/addUser")
    public String addUser() {
        Integer integer = userMapper.addUser(new user(6, "陈昌霖", "123"));
        return integer.toString();
    }

    @GetMapping("/queryUserById")
    public String queryUserById() {
        user user = userMapper.queryUserById(3);
        return user.toString();
    }

    @GetMapping("/delUser")
    public String delUser() {
        Integer integer = userMapper.delUser(5);
        return integer.toString();
    }

}
