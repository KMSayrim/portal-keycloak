package com.kafein.portalauth.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class KeyCloakConfiguration {
    @Value("${jwt.auth.converter.resource-id}")
    private String resourceId;
    @Value("${jwt.auth.converter.principle-attribute}")
    private String principleAttribute;
}

