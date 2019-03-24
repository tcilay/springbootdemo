package com.tcilay.sbm.service;

import com.tcilay.sbm.bean.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAll(int pageNum,int pageSize);
}
