package com.challengemarketplace.challengemarketplace.usecase.service;


import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

import java.util.List;

public interface ProductUseCase {

    Product createProduct(Product product);

    List<Product> findListProducts (Product product);
}
