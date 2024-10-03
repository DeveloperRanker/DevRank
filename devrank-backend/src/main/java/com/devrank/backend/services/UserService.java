package com.devrank.backend.services;

import com.devrank.backend.dtos.RegisterRequest;
import com.devrank.backend.models.User;

public interface UserService {
    User registerNewUser(RegisterRequest request);
}
