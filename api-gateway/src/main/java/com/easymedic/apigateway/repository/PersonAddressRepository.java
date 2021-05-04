package com.easymedic.apigateway.repository;

import com.easymedic.apigateway.model.PersonAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author danushka
 * 5/4/2021
 */
public interface PersonAddressRepository extends JpaRepository<PersonAddressEntity,Long> {
}
