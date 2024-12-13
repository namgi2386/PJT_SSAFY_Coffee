package com.group.ssafycoffeeTest_app.service.product;

import com.group.ssafycoffeeTest_app.domain.product.Product;
import com.group.ssafycoffeeTest_app.domain.product.ProductRepository;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductCreateRequest;
import org.springframework.stereotype.Service;

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
}
