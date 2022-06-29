package com.challengemarketplace.challengemarketplace.entrypoint.mapper.request;

import com.challengemarketplace.challengemarketplace.entrypoint.model.request.ProductModelRequest;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductEntryPointRequestMapperTest {

    @Test
    void convertRequestMapperSucess() {
        ProductModelRequest mockProduct = mockProduct();
        Product product = ProductEntryPointRequestMapper.convertProduct(mockProduct);

        assertNotNull(product);
        assertAll(
                () -> assertEquals("Iphone12", product.getNameProduct()),
                () -> assertEquals("16GB",product.getDescriptionProduct()),
                () -> assertEquals("Apple",product.getProductBrand()),
                () -> assertEquals(100.00,product.getPrice())
        );
    }
    private ProductModelRequest mockProduct() {
        return ProductModelRequest.builder()
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .productBrand("Apple")
                .price(100.00)
                .build();
    }
}