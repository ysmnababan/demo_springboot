package com.example.learn.user.api.service;

import com.example.learn.user.api.dto.User;
import com.example.learn.user.api.dto.UserSpec;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAll();
    User getUserById(UUID userId);
    User createUser(UserSpec user);
}
