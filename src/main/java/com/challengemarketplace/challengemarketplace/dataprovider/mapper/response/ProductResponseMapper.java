package com.challengemarketplace.challengemarketplace.dataprovider.mapper.response;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

public class ProductResponseMapper {

    public static Product convertEntityDomain(ProductEntity productEntity) {

        return Product.builder()
                .idProduct(productEntity.getIdProduct())
                .nameProduct(productEntity.getNameProduct())
                .descriptionProduct(productEntity.getDescriptionProduct())
                .productBrand(productEntity.getProductBrand())
                .ProductOffered(productEntity.getProductOffered())
                .discountPorcentage(productEntity.getDiscountPorcentage())
                .active(productEntity.getProductActive())
                .price(productEntity.getPriceProduct())
                .build();
    }


}