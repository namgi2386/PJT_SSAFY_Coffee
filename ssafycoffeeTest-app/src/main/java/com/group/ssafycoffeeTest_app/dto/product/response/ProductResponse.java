package com.group.ssafycoffeeTest_app.dto.product.response;

public class ProductResponse {
    private String productName;
    private String category;

    public ProductResponse(String productName, String category) {
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }
}
