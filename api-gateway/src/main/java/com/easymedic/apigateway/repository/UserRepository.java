package com.easymedic.apigateway.repository;

import com.easymedic.apigateway.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author danushka
 * 5/4/2021
 */
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserNameAndStatus(String userName, String status);

    UserEntity findByUserName(String userName);
}
