package com.example.custom_message_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomMessageController {
    @GetMapping("/message")
    public String getCustomMessage(){
        return "Hello, this is a custom message from Spring Boot!";
    }
}
