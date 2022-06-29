package com.challengemarketplace.challengemarketplace.usecase.gateway;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

import java.util.List;
import java.util.Optional;


public interface ProductGateway {

    Optional<Product> findByName(String nameProduct);

    Product createProduct (Product product);

    List<Product> listProducts (Product product);
}
