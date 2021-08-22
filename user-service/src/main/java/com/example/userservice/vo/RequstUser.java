package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequstUser {
    @NotNull(message = "Email cannot be NULL")
    @Size(min = 2, message = "Email cannot be less than 2 characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be NULL")
    @Size(min = 2, message = "Name cannot be less than 2 characters")
    private String name;

    @NotNull(message = "Password cannot be NULL")
    @Size(min = 8, message = "Password must be greater than 7 characters")
    private String password;
}
