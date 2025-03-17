package com.example.learn.user.impl.mapper;

import com.example.learn.user.api.dto.User;
import com.example.learn.user.api.entity.UserEntity;

public class UserMapper {
    public static User mapUserEntityToUser(UserEntity userEntity){
        return User.builder()
                .id(userEntity.getId())
                .email(userEntity.getEmail())
                .username(userEntity.getUsername())
                .build();
    }
}
