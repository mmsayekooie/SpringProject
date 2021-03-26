package com.example.practice.web;

import java.io.Serializable;

public class UserCreateRequest implements Serializable {
    private Long id;
    private String name;
    @Email
    @NotEmpty
    private String mail;
    private Integer roleId;

}
