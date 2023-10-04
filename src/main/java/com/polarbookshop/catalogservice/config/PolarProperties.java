package com.polarbookshop.catalogservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : Jason Ho
 * @since : 2023/10/3
 */
@ConfigurationProperties(prefix = "polar")
@Data
public class PolarProperties {
    /**
     * A message to welcome users.
     */
    private String greeting;
    private String say;
    private boolean test;
}
