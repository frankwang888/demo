package com.feign.feign.controller;

/**
 * @Auther: jc
 * @Date: 2019/1/7 10:44
 * @Description:
 */

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements Feign{

    @Override
    public String hello() {
        return "failed";
        //return  "hello, this messge send failed ";
    }

}
