package com.challengemarketplace.challengemarketplace.dataprovider.implementation;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.gateway.ProductGateway;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductImplementation implements ProductGateway {
    @Override
    public Optional<Product> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
