package com.example.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody
    String getDomain() {
        return "hello spring-boot";

    }

    @Value("${pay_url}")
    private String pay_url;

    @RequestMapping("/url")
    public @ResponseBody String getString() {
        return pay_url+"自定义的url";
    }
}
