package com.abeng.east.springboot0610.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name", required = false) String name) {
        return name;
    }
}
