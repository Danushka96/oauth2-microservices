package com.easymedic.apigateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author danushka
 * 5/4/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_approvals")
public class OauthApprovalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String clientId;
    private String scope;
    private String status;
    private Date expiresAt;
    private Date lastModifiedAt;
}
