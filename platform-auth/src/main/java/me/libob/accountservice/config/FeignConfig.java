package me.libob.accountservice.config;


import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {


    @Bean
    public Retryer retryer() {
        return new  Retryer.Default();
    }



}
