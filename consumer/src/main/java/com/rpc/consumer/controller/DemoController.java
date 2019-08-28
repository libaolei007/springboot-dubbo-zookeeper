package com.rpc.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpc.api.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/getHello")
    @ResponseBody
    public String getHello() {
        return demoService.sayHello("李保磊");
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
