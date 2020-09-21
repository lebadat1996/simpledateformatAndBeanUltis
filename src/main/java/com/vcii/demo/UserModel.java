package com.vcii.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class UserModel {
    private int id;
    private String name;
    private String username;
    private String password;
    private String createDate;
}
