package com.devrank.backend.services.impl;

import com.devrank.backend.dtos.RegisterRequest;
import com.devrank.backend.mappers.UserMapper;
import com.devrank.backend.models.User;
import com.devrank.backend.repositories.UserRepository;
import com.devrank.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    @Override
    public User registerNewUser(RegisterRequest request) {

        String hashedPassword = passwordEncoder.encode(request.getPassword());

        User newUser = userMapper.registerRequestToUser(request);
        newUser.setHashedPassword(hashedPassword);

        return userRepository.saveAndFlush(newUser);

    }
}
