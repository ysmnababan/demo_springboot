package com.example.learn.user.impl.service;

import com.example.learn.user.api.dto.User;
import com.example.learn.user.api.dto.UserSpec;
import com.example.learn.user.api.entity.UserEntity;
import com.example.learn.user.api.service.UserService;
import com.example.learn.user.impl.mapper.UserMapper;
import com.example.learn.user.impl.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static com.example.learn.user.impl.mapper.UserMapper.mapUserEntityToUser;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        var users= userRepository.findAll();
        return users.stream().map(UserMapper::mapUserEntityToUser).toList();
    }

    @Override
    public User getUserById(UUID userId) {
        var user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        return mapUserEntityToUser(user);
    }

    @Override
    public User createUser(UserSpec user) {
        var userBuilder= UserEntity.builder()
//                .id(UUID.randomUUID())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
        var newUser = userRepository.save(userBuilder);

        return mapUserEntityToUser(newUser);
    }
}