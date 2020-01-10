package com.sys.system.service.impl;

import com.sys.system.dao.UserMapper;
import com.sys.system.pojo.User;
import com.sys.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : UserServiceImpl
 * @Author ：lijie
 * @Date ：Created in 2020/1/10 15:08
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;


    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }
}
