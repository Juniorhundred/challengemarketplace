package com.challengemarketplace.challengemarketplace.dataprovider.repository;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository
        extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByName(String name);
}


