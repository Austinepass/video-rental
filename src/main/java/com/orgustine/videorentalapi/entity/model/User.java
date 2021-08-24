package com.orgustine.videorentalapi.entity.model;

import javax.persistence.Column;

public class User extends BaseModel{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
