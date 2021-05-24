package com.springsecurity.springsecurity1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String run(){
        return "WELCOME!!";
    }

    @GetMapping("/admin")
    public String adminpage(){
        return "WELCOME to admin page!!";
    }

    @GetMapping("/user")
    public String userpage(){
        return "WELCOME to user page!!";
    }
}
