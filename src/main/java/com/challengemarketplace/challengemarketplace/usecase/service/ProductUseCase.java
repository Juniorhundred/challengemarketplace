package com.challengemarketplace.challengemarketplace.usecase.service;


import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

public interface ProductUseCase {

    Product createProduct (Product product);
    //Criar produto com os dados de dominio
}
