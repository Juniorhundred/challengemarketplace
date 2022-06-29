package com.challengemarketplace.challengemarketplace.usecase.service;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.CheckPriceError;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.ValidationDuplicityNameException;
import com.challengemarketplace.challengemarketplace.usecase.gateway.ProductGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUseCaseImpl implements ProductUseCase {
    private final ProductGateway productGateway;

    public ProductUseCaseImpl(ProductGateway productGateway) {

        this.productGateway = productGateway;
    }

    public Product createProduct(Product productRequestDomain) {
        validateProduct(productRequestDomain);
        productRequestDomain.setActive(true);
        productRequestDomain.setProductOffered(false);
        productRequestDomain.setDiscountPorcentage(0);
        return productGateway.createProduct(productRequestDomain);
    }

    @Override
    public List<Product> findListProducts(Product product) {
        return productGateway.listProducts(product);
    }

    private void validateProduct(Product productRequestDomain) {
        validatePriceZeroOrNegative(productRequestDomain);
        ValidateDuplicationNameProduct(productRequestDomain);
    }


    private void ValidateDuplicationNameProduct(Product productRequestDomain) {
        productGateway
                .findByName(productRequestDomain
                        .getNameProduct())
                .ifPresent(product -> {
            throw new ValidationDuplicityNameException(
                    String.format("O Produto '%s' consta como cadastrado no sistema", productRequestDomain
                            .getNameProduct()));
        });
    }

    private void validatePriceZeroOrNegative(Product productRequestDomain) {
        if (productRequestDomain.getPrice() <= 0) {
            throw new CheckPriceError(String.format("O preço '%s' não pode ser zerado ", productRequestDomain.getPrice()));
        }

    }
}


