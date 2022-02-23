package me.libob.accountservice.service;

import me.libob.accountservice.domain.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo getById(Long id);

    boolean save(UserInfo userInfo);

    UserInfo findByUserName(String username);

    List<UserInfo> list();
}
