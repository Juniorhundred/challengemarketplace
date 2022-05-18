package com.challengemarketplace.challengemarketplace.usecase.service;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.ValidationDuplicityNameException;
import com.challengemarketplace.challengemarketplace.usecase.gateway.ProductGateway;
import com.challengemarketplace.challengemarketplace.usecase.implementation.CheckPriceError;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductGateway productGateway;

    public ProductUseCaseImpl(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public Product createProduct(Product productRequestDomain) {
        return productGateway.createProduct(productRequestDomain);

    }

    private void validarDuplicidadeNomeProduto(Product productRequestDomain) {
        productGateway.findByName(productRequestDomain.getNameProduct())
                .ifPresent(product -> {
            throw new ValidationDuplicityNameException(String.format("O Produto '%s' consta como cadastrado no sistema",
                    productRequestDomain.getNameProduct()));
                });
    }

    private void validarPrecoZeradoOuNegativo(Product productRequestDomain){
        if (productRequestDomain.getPrice() <= 0){
        throw new CheckPriceError(String.format("O preço '%s' não pode ser zerado ou negativo")),
        productRequestDomain.getPrice()));
    }

    }
}


