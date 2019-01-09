package com.feign.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jc
 * @Date: 2019/1/4 11:26
 * @Description:
 */

@Controller
public class HelloController {
    @Autowired
    private Feign feign;

    @RequestMapping("/hello1")
    public String hello(){
        return feign.hello();
    }
}
