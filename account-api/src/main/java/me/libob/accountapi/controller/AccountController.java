package me.libob.accountapi.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/user/{id}")
    public String getById(@PathVariable Long id) throws InterruptedException {
        System.out.println("received request");
        Thread.sleep(3000L);
        throw new RuntimeException();
//        return "hello world id = " + id;
    }
}
