package com.auth.learn.snbsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijianyu
 * @date 2018/11/5 14:20
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(path = "/echo")
    public String echo(){
        return "hello world spring security";
    }

}
