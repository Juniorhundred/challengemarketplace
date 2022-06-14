package com.challengemarketplace.challengemarketplace.dataprovider.repository;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository
        extends JpaRepository<ProductRepository, Long> {
    Optional<Product> findByName(String name);
}


