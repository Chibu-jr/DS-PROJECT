package com.microservice.productservice.service;


import com.microservice.productservice.model.ProductRequest;
import com.microservice.productservice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    long saveProducts(ProductRequest productRequest);
}
