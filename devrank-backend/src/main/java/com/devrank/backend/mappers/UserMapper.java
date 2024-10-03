package com.devrank.backend.mappers;

import com.devrank.backend.dtos.RegisterRequest;
import com.devrank.backend.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User registerRequestToUser(RegisterRequest request);
}
