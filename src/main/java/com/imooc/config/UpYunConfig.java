package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("upyun")
@Data
public class UpYunConfig {

    private String bucketName;

    private String username;

    private String password;

    /**
     * http://xxx.com/
     */
    private String imageHost;
}
