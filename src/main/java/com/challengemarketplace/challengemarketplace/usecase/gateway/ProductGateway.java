package com.challengemarketplace.challengemarketplace.usecase.gateway;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface ProductGateway {

    Optional<Product> findByName (String name);

    Product createProduct (Product product);
}
