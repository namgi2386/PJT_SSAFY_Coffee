package com.group.ssafycoffeeTest_app.domain.product;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID = null;

    @Column(name = "Productname")
    private String productName;
    private Integer price;
    @Column(name="Category")
    private String category;
    @Column(name="Kcal")
    private Integer kcal;
    @Column(name = "Info")
    private String info;
    @Column(name = "Field")
    private String field;

    public Product(){}

    public Product(String productName, Integer price, String category, Integer kcal, String info, String field) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.kcal = kcal;
        this.info = info;
        this.field = field;
    }

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
