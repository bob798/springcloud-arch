package me.libob.feignapi.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "accountapi")
public interface AccountClient {

    @GetMapping("/user/{id}")
    public String getById(@PathVariable Long id);
}
