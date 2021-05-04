package com.easymedic.apigateway.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author danushka
 * 5/4/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResponse implements Serializable {

    private String message;
    private boolean isValidRequest;
    private Object responseData;
    private Integer status;

}
