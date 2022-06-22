package com.challengemarketplace.challengemarketplace.usecase.gateway;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

import java.util.Optional;


public interface ProductGateway {

    Optional<Product> findByName(String name);

    Product createProduct(Product product);
}
