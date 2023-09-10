package com.postgresexample.postgresexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    private String routingMessage(String message){
        return message;
    }
    @GetMapping("/")
    String getHomeMethod() {
        return routingMessage("Hey Welcome to my app please visit routes as /weather or /weather/country you can post via giving id after this api routes. Thank you and welcome again.");
    }
    
    @GetMapping("*")
    String getErrorMethod() {
        return routingMessage("Hello visitor this is error page. please visit routes as /weather or /weather/country you can post via giving id after this api routes. Thank you and welcome again.");
    }
}
