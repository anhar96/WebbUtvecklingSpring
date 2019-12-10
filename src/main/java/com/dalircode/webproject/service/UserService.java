package com.dalircode.webproject.service;

import com.dalircode.webproject.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
