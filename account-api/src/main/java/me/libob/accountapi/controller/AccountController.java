package me.libob.accountapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/user/{id}")
    public String getById(@PathVariable Long id) {
        return "hello world id = " + id;
    }
}
