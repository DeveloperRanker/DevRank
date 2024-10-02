package com.devrank.backend.services.impl;

import com.devrank.backend.mappers.UserMapper;
import com.devrank.backend.repositories.UserRepository;
import com.devrank.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

}
