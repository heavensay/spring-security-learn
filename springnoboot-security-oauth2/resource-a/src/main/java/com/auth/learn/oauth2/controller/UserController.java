package com.auth.learn.oauth2.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijianyu
 * @date 2018/11/5 14:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

//    @Secured()
    @GetMapping(path = "/name")
    @PreAuthorize("ROLE_Admin")
    public String getName(){
        return "tom";
    }

    @GetMapping(path = "/age")
    public Integer getAge(){
        return 18;
    }
}
