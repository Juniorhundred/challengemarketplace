package com.challengemarketplace.challengemarketplace.entrypoint.mapper.response;

import com.challengemarketplace.challengemarketplace.entrypoint.model.response.ProductModelResponse;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductEntryPointResponseMapper {
    private  ProductEntryPointResponseMapper(){ }
    public static List<ProductModelResponse> convertList(List<Product> products) {
        List<ProductModelResponse> productsModelResponse = new ArrayList<>();
        products.forEach(product -> {
            ProductModelResponse productModelResponse = convertProduct(product);
            productsModelResponse.add(productModelResponse);
        });
        return productsModelResponse;
    }

    public static ProductModelResponse convertProduct(Product product) {

        return ProductModelResponse.builder()
                .idProduct(product.getIdProduct())
                .nameProduct(product.getNameProduct())
                .descriptionProduct(product.getDescriptionProduct())
                .productBrand(product.getProductBrand())
                .ProductOffered(product.getProductOffered())
                .active(product.getActive())
                .price(product.getPrice()).build();
    }
}
