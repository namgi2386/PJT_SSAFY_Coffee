package com.group.ssafycoffeeTest_app.service.product;

import com.group.ssafycoffeeTest_app.domain.product.Product;
import com.group.ssafycoffeeTest_app.domain.product.ProductRepository;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductCreateRequest;
import com.group.ssafycoffeeTest_app.dto.product.response.ProductResponse;
import com.group.ssafycoffeeTest_app.dto.user.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void saveProduct(ProductCreateRequest request){
        productRepository.save(new Product(request.getProductName(),
                request.getPrice(),
                request.getCategory(),
                request.getKcal(),
                request.getInfo(),
                request.getField()));
    }
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> new ProductResponse(product.getProductName() , product.getCategory()))
                .collect(Collectors.toList());
    }
    public List<Product> getProductsAll(){
        return productRepository.findAll();
    }
}
