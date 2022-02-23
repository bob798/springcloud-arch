package me.libob.accountservice.domain;

import lombok.Data;

@Data
public class UserInfo {
    private Long id;
    private String userName;
    private String password;
}
