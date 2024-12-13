package com.group.ssafycoffeeTest_app.service.product;

import com.group.ssafycoffeeTest_app.domain.product.Product;
import com.group.ssafycoffeeTest_app.domain.product.ProductRepository;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductCreateRequest;
import com.group.ssafycoffeeTest_app.dto.product.request.ProductUpdateRequest;
import com.group.ssafycoffeeTest_app.dto.product.response.ProductResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional
    public void saveProduct(ProductCreateRequest request){
        productRepository.save(new Product(request.getProductName(),
                request.getPrice(),
                request.getCategory(),
                request.getKcal(),
                request.getInfo(),
                request.getField()));
    }
    @Transactional(readOnly = true)
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> new ProductResponse(product.getProductName() , product.getCategory()))
                .collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    public List<Product> getProductsAll(){
        return productRepository.findAll();
    }

    @Transactional
    public void updateProduct(ProductUpdateRequest request){
        Product product = productRepository.findById(request.getProductID())
                .orElseThrow(IllegalArgumentException::new);
        product.updateProduct(request.getProductName() , request.getPrice());
    }
    @Transactional
    public void deleteProduct(String productName){ // 이름으로 삭제하기
        Product product = productRepository.findByProductName(productName).orElseThrow(IllegalArgumentException::new);
        productRepository.delete(product);
    }
    public void deleteProductById(long productID){
        Product product = productRepository.findById(productID).orElseThrow(IllegalArgumentException::new);
        productRepository.delete(product);
    }
}
