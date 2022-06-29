package com.challengemarketplace.challengemarketplace.entrypoint.mapper.request;

import com.challengemarketplace.challengemarketplace.entrypoint.model.request.ProductModelRequest;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

public class ProductEntryPointRequestMapper {
    private  ProductEntryPointRequestMapper(){ }
    public static Product convertProduct(ProductModelRequest productModelRequest) {

        return Product.builder()
                .nameProduct(productModelRequest.getNameProduct())
                .descriptionProduct(productModelRequest.getDescriptionProduct())
                .productBrand(productModelRequest.getProductBrand())
                .price(productModelRequest.getPrice())
                .build();
    }
}
