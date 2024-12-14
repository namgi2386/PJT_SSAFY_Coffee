package com.group.ssafycoffeeTest_app.domain.product.productoption;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.group.ssafycoffeeTest_app.domain.product.Product;
import jakarta.persistence.*;

@Entity
public class ProductOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("optionID")
    private Long optionID = null;

    @ManyToOne
    private Product product;

    @JsonProperty("optionName")
    private String optionName;
    @JsonProperty("optionPrice")
    private Integer optionPrice;

    protected ProductOption(){}

    public ProductOption(Product product , String optionName , Integer optionPrice){
        this.product = product;
        this.optionName = optionName;
        this.optionPrice = optionPrice;
    }

}
