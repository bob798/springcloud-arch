package me.libob.accountservice.controller;

import me.libob.feignapi.client.AccountClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountController {

    @Resource
    private AccountClient accountClient;

    @GetMapping("/account/{id}")
    public String account(@PathVariable Long id)  {
        System.out.println("send request");
        return accountClient.getById(id);
    }

}
