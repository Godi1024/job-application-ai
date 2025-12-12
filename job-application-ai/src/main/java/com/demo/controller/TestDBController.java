package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.UserInput;
import com.demo.repository.UserInputRepository;

@RestController
public class TestDBController {

    @Autowired
    private UserInputRepository repo;

    @GetMapping("/test-db")
    public String testDb() {

        UserInput u = new UserInput();
       u.setMyEmail("test@gmail.com");
        u.setHrEmail("hr@company.com");
        u.setJobDescription("Testing connection...");
        u.setResumeUrl("none");

        repo.save(u);

        return "DB Working!";
    }
}
