package com.distance.auth.exception;

import com.distance.auth.serializer.CustomOauthExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @description: oauth2自定义异常
 */
@JsonSerialize(using = CustomOauthExceptionSerializer.class)
public class CustomOauth2Exception extends OAuth2Exception {

    public CustomOauth2Exception(String msg) {
        super(msg);
    }
}
