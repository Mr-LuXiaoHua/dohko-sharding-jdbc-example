package com.dohko.service;

import com.dohko.entity.User;

public interface UserService {

    void add(User user);

    User getById(Long userId);
}
