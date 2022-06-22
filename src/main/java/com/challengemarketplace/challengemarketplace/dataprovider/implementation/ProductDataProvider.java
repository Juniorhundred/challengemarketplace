package com.challengemarketplace.challengemarketplace.dataprovider.implementation;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.dataprovider.mapper.request.ProductRequestMapper;
import com.challengemarketplace.challengemarketplace.dataprovider.mapper.response.ProductResponseMapper;
import com.challengemarketplace.challengemarketplace.dataprovider.repository.ProductRepository;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.ValidationDuplicityNameException;
import com.challengemarketplace.challengemarketplace.usecase.gateway.ProductGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ProductDataProvider implements ProductGateway {

    private final ProductRepository productRepository;

    @Override
    public Optional<Product> findByName(String name) {
        return productRepository.findByName(name)
                .map(ProductResponseMapper::convertEntityDomain);
    }

    @Override
    public Product createProduct(Product product) {
        try {
            ProductEntity createByProduct = ProductRequestMapper.convertDomainEntity(product);
            ProductEntity productCreate = productRepository.save(createByProduct);

            return ProductResponseMapper.convertEntityDomain(productCreate);
        } catch (Exception exception) {
            throw new ValidationDuplicityNameException(String.
                    format("O Produto '%s' consta como cadastrado no sistema", exception));
        }
    }
};


