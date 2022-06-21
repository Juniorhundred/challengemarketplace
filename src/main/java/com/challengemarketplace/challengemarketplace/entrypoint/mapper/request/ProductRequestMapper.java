package com.challengemarketplace.challengemarketplace.entrypoint.mapper.request;

import com.challengemarketplace.challengemarketplace.entrypoint.model.request.ProductModelRequest;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

public class ProductRequestMapper {

    public static Product converterProduct (ProductModelRequest productModelRequest) {

        return Product.builder()
                .nameProduct(productModelRequest.getNameProduct())
                .descriptionProduct(productModelRequest.getDescriptionProduct())
                .productBrand(productModelRequest.getProductBrand())
                .ProductOffered(productModelRequest.getProductOffered())
                .active(productModelRequest.getActive())
                .price(productModelRequest.getPrice())
                .build();
    }
}
