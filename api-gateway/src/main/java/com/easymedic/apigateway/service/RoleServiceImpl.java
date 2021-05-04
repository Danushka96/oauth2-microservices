package com.easymedic.apigateway.service;

import com.easymedic.apigateway.model.UserRoleEntity;
import com.easymedic.apigateway.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author danushka
 * 5/4/2021
 */
public class RoleServiceImpl implements RoleService{
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UserRoleEntity> getAllRoles() {
        LOGGER.info("getAllRoles method call...");
        return roleRepository.findAll();
    }
}
