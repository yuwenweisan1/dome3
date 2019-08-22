package com.abc.dao;

import com.abc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
//@Mapper则是对应mybatis的mapper.xml
public interface UserDao {
    User login(User user);
}
