package com.client.eurekaclient.controller;

import com.client.eurekaclient.service.SysJobService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jc
 * @Date: 2019/1/4 10:42
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    private SysJobService sysJobService;

    private Logger logger =  LogManager.getLogger(this.getClass());

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        long i = sysJobService.countByExample(null);
        System.out.println(i);
        logger.info("日志");
        return "hello2";
    }

}
