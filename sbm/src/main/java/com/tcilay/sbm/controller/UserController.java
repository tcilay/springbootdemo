package com.tcilay.sbm.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.tcilay.sbm.bean.User;
import com.tcilay.sbm.service.UserService;
import com.tcilay.sbm.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser( @RequestBody User user){
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(JsonUtil.toJson(user));
        System.out.println("==============================");
        System.out.println("==============================");

//        user = new User();
//        user.setId("1");
//        user.setName("1");
//        user.setDesc("1");


        return userService.addUser(user);
    }

    @PostMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.print(pageNum);
        System.out.print(pageSize);
        System.out.println("==============================");
        System.out.println("==============================");
        List<User> users = userService.findAll(pageNum, pageSize);
        return users;
    }

}
