package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    private Environment env;

    @Autowired
    private Greeting greeting;

    @Autowired
    public UserController(Environment env) {
        this.env = env;
    }

    // application.yml 파일에 있는 값 사용 방법 (1)
    @GetMapping("/welcome")
    public String welcome(){
        return env.getProperty("greeting.message");
    }

    // application.yml 파일 값 사용 방법 (2)
    @GetMapping("/welcome2")
    public String welcome2(){
        return greeting.getMessage();
    }

    @GetMapping("/health_check")
    public String status(){
        return "It's working in User Service";
    }
}
