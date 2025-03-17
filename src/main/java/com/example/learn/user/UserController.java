package com.example.learn.user;

import com.example.learn.user.api.dto.User;
import com.example.learn.user.api.dto.UserSpec;
import com.example.learn.user.api.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable UUID id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserSpec user){
        return userService.createUser(user);
    }
}
