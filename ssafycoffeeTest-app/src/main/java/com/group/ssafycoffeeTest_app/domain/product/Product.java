package com.group.ssafycoffeeTest_app.domain.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.group.ssafycoffeeTest_app.domain.product.productoption.ProductOption;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("productID")
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

    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<ProductOption> productOptions = new ArrayList<>();

    public List<ProductOption> getProductOptions() {
        return productOptions;
    } // 혹시 사용할지 모르니까 추가함

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
    public void updateProduct(String name, int price){
        this.productName = name;
        this.price = price;
    }
}
