package com.group.ssafycoffeeTest_app.dto.product.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductCreateRequest {

    @JsonProperty("productName")
    private String productName;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("category")
    private String category;
    @JsonProperty("kcal")
    private Integer kcal;
    @JsonProperty("info")
    private String info;
    @JsonProperty("field")
    private String field;


    public String getProductName() {
        return productName;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Integer getKcal() {
        return kcal;
    }

    public String getInfo() {
        return info;
    }

    public String getField() {
        return field;
    }

}
