package com.easymedic.apigateway.service;

import com.easymedic.apigateway.model.UserRoleEntity;

import java.util.List;

/**
 * @author danushka
 * 5/4/2021
 */
public interface RoleService {
    List<UserRoleEntity> getAllRoles();
}
