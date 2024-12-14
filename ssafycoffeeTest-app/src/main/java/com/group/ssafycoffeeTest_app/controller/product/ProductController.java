package com.group.ssafycoffeeTest_app.controller.product;

import com.group.ssafycoffeeTest_app.domain.product.Product;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductCreateRequest;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductUpdateRequest;
import com.group.ssafycoffeeTest_app.dto.product.response.ProductResponse;
import com.group.ssafycoffeeTest_app.service.product.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/product")
    public List<ProductResponse> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/productAll")
    public List<Product> getProductsAll(){
        return productService.getProductsAll();
    }
    @PutMapping("/product")
    public void productUpdate(@RequestBody ProductUpdateRequest request){
        productService.updateProduct(request);
    }
    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam(name = "productName") String productName ){
        productService.deleteProduct(productName);
    }
    @DeleteMapping("/productByID")
    public void deleteProductById(@RequestParam(name = "productID") long productID){
        productService.deleteProductById(productID);
    }
    
}
