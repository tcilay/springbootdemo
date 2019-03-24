package com.tcilay.sbm.service.impl;

import com.github.pagehelper.PageHelper;
import com.tcilay.sbm.bean.User;
import com.tcilay.sbm.mapper.UserMapper;
import com.tcilay.sbm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    @Transactional
    public int addUser(User user) {
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
       return userMapper.insert(user);
    }

    @Override
    public List<User> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
