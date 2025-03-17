package com.example.learn.user.impl.repository;

import com.example.learn.user.api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository
        extends JpaRepository<UserEntity, UUID> {

}
