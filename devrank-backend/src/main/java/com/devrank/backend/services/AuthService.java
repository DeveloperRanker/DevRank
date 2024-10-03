package com.devrank.backend.services;

public interface AuthService {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
