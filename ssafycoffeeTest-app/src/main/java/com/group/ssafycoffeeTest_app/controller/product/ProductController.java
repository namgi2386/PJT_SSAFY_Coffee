package com.group.ssafycoffeeTest_app.controller.product;

import com.group.ssafycoffeeTest_app.dto.product.request.ProductCreateRequest;
import com.group.ssafycoffeeTest_app.service.product.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/product")
    public void saveProduct(@RequestBody ProductCreateRequest request){
        productService.saveProduct(request);
    }

}
