package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    private static final long serialVersionUID = 7097863777546530545L;

    @JsonProperty("name")
    private String categoryName;//商品分类名

    @JsonProperty("type")
    private Integer categoryType; //商品分类

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList; //商品
}
