package com.feign.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: jc
 * @Date: 2019/1/4 11:24
 * @Description:
 */

@Component
@FeignClient(value = "client",name = "client",fallback = HelloRemoteHystrix.class)
public interface Feign {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();

}
