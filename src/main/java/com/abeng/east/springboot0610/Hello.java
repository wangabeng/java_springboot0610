package com.abeng.east.springboot0610;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/test1")
    public String sayHello() {
        return "Hello,World!test2";
    }
}
