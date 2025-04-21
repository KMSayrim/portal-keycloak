package com.kafein.portalauth.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class KeyCloakConfiguration {
    @Value("${jwt.auth.converter.resource-id}")
    private String resourceId;
    @Value("${jwt.auth.converter.principle-attribute}")
    private String principleAttribute;

    // Getter ve Setter metodları

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getPrincipleAttribute() {
        return principleAttribute;
    }

    public void setPrincipleAttribute(String principleAttribute) {
        this.principleAttribute = principleAttribute;
    }
}

