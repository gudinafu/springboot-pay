package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = 219132828123341053L;

    @JsonProperty("id")
    private String productId; //商品ID

    @JsonProperty("name")
    private String productName; //商品名

    @JsonProperty("price")
    private BigDecimal productPrice; //商品价格

    @JsonProperty("description")
    private String productDescription; //商品描述

    @JsonProperty("icon")
    private String productIcon; //商品图标
}

