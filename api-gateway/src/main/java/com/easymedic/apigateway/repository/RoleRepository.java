package com.easymedic.apigateway.repository;

import com.easymedic.apigateway.model.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author danushka
 * 5/4/2021
 */
public interface RoleRepository extends JpaRepository<UserRoleEntity,Long> {
}
