package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){

        return "langzi swarm!";
    }
}
