package com.xc.controller;

import com.xc.service.UserService;
import com.xc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2015/8/3.
 */
@RestController
public class UserController {

    private UserService userService;

    @Lazy
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/test")
    public User view1() {
        User user = new User();
        user.setId(1L);
        user.setName("haha");
        return user;
    }

    @RequestMapping("/test2")
    public String view2() {
        return "{\"id\" : 1}";
    }


}
