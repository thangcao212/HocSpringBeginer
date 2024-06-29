package com.learnspringboot.thang11.mapper;

import com.learnspringboot.thang11.dto.request.UserCreationRequest;
import com.learnspringboot.thang11.dto.request.UserUpdateRequest;
import com.learnspringboot.thang11.dto.response.UserResponse;
import com.learnspringboot.thang11.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}