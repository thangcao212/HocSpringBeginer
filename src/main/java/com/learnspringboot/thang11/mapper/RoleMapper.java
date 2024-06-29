package com.learnspringboot.thang11.mapper;

import com.learnspringboot.thang11.dto.request.RoleRequest;
import com.learnspringboot.thang11.dto.response.RoleResponse;
import com.learnspringboot.thang11.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
