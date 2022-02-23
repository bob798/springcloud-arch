package me.libob.accountservice.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class UserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    void list() {
        System.out.println(JSON.toJSON(userInfoService.list()));
    }
}