package com.abc;

import com.abc.entity.User;
import com.abc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo02ApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    public void contextLoads() {
        User user=new User();
        user.setUsername("admin");
        user.setPassword("123456");
        User s = userService.login(user);
        System.out.println(s);
    }

}
