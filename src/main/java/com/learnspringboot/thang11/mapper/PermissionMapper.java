package com.learnspringboot.thang11.mapper;

import com.learnspringboot.thang11.dto.request.PermissionRequest;
import com.learnspringboot.thang11.dto.response.PermissionResponse;
import com.learnspringboot.thang11.entity.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
