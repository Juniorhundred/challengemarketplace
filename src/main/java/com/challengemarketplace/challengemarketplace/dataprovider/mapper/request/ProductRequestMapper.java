package com.challengemarketplace.challengemarketplace.dataprovider.mapper.request;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

public class ProductRequestMapper {
    public static ProductEntity converterDomainEntity ( Product product){
        return ProductEntity.builder()
                .idProduct(product.getIdProduct())
                .nameProduct(product.getNameProduct())
                .descriptionProduct(product.getDescriptionProduct())
                .productBrand(product.getProductBrand())
                .priceProduct(product.getPrice())
                .productActive(product.getActive())
                .productOffered(product.getProductOffered())
                .discountPorcentage(product.getDiscountPorcentage())
                .build();

    }
}
