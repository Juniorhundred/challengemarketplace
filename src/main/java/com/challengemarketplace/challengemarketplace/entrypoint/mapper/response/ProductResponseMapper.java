package com.challengemarketplace.challengemarketplace.entrypoint.mapper.response;

import com.challengemarketplace.challengemarketplace.entrypoint.model.response.ProductModelResponse;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductResponseMapper {

    public static List<ProductModelResponse> convertListModelResponse(List<Product> products) {
        List<ProductModelResponse> productsModelResponse = new ArrayList<>();
        products.forEach(product -> {
            ProductModelResponse produtoModelResponse = convert(product);
            productsModelResponse.add(produtoModelResponse);
        });
        return productsModelResponse;
    }

    private static ProductModelResponse convert(Product product) {

        return ProductModelResponse.builder().nameProduct(product.getNameProduct()).descriptionProduct(product.getDescriptionProduct()).productBrand(product.getProductBrand()).ProductOffered(product.getProductOffered()).active(product.getActive()).price(product.getPrice()).build();
    }
}
