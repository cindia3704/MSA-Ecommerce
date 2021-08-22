package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;


@Data
public class UserDto {
    private String userId;

    private String email;

    private String name;

    private String password;

    private Date createdAt;

    private String encryptedPassword;
}
