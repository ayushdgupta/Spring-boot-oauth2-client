package com.guptaji.Oauth2Learning.controller;

import com.guptaji.Oauth2Learning.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/getUser")
    public ResponseEntity<?> fetchUser(){
        LOG.info("Returning user");
        return new ResponseEntity<>(new Employee("Ayush", 123L, "UHG"), HttpStatus.OK);
    }
}
