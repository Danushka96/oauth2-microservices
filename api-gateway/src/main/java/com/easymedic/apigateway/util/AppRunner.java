package com.easymedic.apigateway.util;

import com.easymedic.apigateway.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author danushka
 * 5/4/2021
 */
@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        //Initially All will be delete when server startup
//        roleRepository.deleteAll();
//        roleRepository.save(new UserRoleEntity(null,"ROLE_ADMIN", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
//        roleRepository.save(new UserRoleEntity(null,"ROLE_USER", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
//        roleRepository.save(new UserRoleEntity(null,"ROLE_PATIENT", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
        System.out.println("Role insert successfully.");
    }
}
