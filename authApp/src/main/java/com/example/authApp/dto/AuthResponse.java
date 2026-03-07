package com.example.authApp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {
    private String role;
    private String token;
}

// Why DTO?

// We never expose entity directly.