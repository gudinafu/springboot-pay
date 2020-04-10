package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


import java.util.Map;
@Data
@Configuration
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    //-----用于授权登录,支付功能------//
    /**
     * 公众平台id
     */
    private String mpAppId;

    /**
     * 公众平台密钥
     */
    private String mpAppSecret;

    //-----用于扫码登录-------//
    /**
     * 开放平台id
     */
    private String openAppId;

    /**
     * 开放平台密钥
     */
    private String openAppSecret;


    //-------用于支付-------//
    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;

    /**
     * 微信模版id
     */
    private Map<String, String> templateId;
}
