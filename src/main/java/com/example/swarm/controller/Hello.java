package com.example.swarm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ResponseBody
public class Hello {

    @RequestMapping("/hello")
    public String hello(){

        return "hello swarm";
    }
}
