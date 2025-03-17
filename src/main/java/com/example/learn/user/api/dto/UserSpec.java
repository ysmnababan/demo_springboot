package com.example.learn.user.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserSpec {
    @NotBlank private String username;
    @NotBlank private String email;
}
