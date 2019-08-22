package com.abc.service;

import com.abc.dao.UserDao;
import com.abc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//加入 spring
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    /*
    select username from user where username=#{username} and password=#{password}
     */
    public User login(User user){

        User login = userDao.login(user);
        return login;
    }
}
