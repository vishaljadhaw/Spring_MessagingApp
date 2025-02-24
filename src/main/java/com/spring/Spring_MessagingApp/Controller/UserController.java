package com.spring.Spring_MessagingApp.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class UserDTO {
    private String firstName;
    private String lastName;

    //getters and setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}

@RestController
@RequestMapping("/hello")
public class UserController {

    @PostMapping(value="/newUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}