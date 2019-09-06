package com.dohko.entity;

import lombok.Data;

@Data
public class User {

    private Long userId;

    /**
     * 性别 1-男；2-女
     */
    private Integer gender;

    private String username;
}
