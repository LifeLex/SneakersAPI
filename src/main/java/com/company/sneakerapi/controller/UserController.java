package com.company.sneakerapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> userMap){
        String firstName = (String) userMap.get("firstName");
        String lasttName = (String) userMap.get("lasttName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        return firstName + " , " + lasttName + " , " + email + " , " + password ;
    }
}
