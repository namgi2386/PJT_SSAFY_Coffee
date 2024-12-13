package com.group.ssafycoffeeTest_app.dto.product.request;

public class ProductUpdateRequest {
    private long productID;
    private String productName;
    private int price;

    public ProductUpdateRequest(){}

    public ProductUpdateRequest(long productID, String productName, int price) { // postman 요청보낼때 변수명
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
}
