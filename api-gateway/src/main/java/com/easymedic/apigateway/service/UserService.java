package com.easymedic.apigateway.service;

import com.easymedic.apigateway.dto.UserSignupDTO;
import com.easymedic.apigateway.model.UserEntity;

/**
 * @author danushka
 * 5/4/2021
 */
public interface UserService {
    String signup(UserSignupDTO userSignupDTO);

    UserEntity findByUserName(String userName);
}
