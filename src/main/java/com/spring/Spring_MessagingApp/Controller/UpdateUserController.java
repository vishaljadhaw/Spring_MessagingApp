package com.spring.Spring_MessagingApp.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class UpdateUserController {

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
