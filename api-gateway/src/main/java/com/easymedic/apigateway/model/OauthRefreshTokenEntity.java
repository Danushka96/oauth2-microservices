package com.easymedic.apigateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author danushka
 * 5/4/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_refresh_token")
public class OauthRefreshTokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "token_id", unique = true)
    @NotNull
    private String tokenId;
    //    @Lob
    private byte[] token;
    //    @Lob
    private byte[] authentication;
}
