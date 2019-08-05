package com.rpc.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpc.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/getHello")
    public String getHello() {
        return demoService.sayHello("李保磊");
    }

}
