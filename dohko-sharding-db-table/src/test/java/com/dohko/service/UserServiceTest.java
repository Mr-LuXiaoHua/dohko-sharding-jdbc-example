package com.dohko.service;

import com.dohko.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        // ds1.t_user_0
        User user = new User();
        user.setGender(1);
        user.setUserId(1000L);
        user.setUsername("LiHuai");
        userService.add(user);

        // ds1.t_user_1
        User user2 = new User();
        user2.setGender(1);
        user2.setUserId(1001L);
        user2.setUsername("YeKai");
        userService.add(user2);

        // ds0.t_user_0
        User user3 = new User();
        user3.setGender(2);
        user3.setUserId(1002L);
        user3.setUsername("luxiaofeng");
        userService.add(user3);

        // ds0.t_user_1
        User user4 = new User();
        user4.setGender(2);
        user4.setUserId(1003L);
        user4.setUsername("chuliuxiang");
        userService.add(user4);
    }
}