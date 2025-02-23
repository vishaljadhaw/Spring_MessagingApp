package com.spring.Spring_MessagingApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class QueryParamHello {

    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam("name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}