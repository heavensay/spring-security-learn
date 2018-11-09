package com.auth.learn.snbsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lijianyu
 * @date 2018/11/5 14:20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(path = "/name")
    public String getName(){
        return "tom";
    }

    @GetMapping(path = "/age")
    public Integer getAge(){
        return 18;
    }
}
