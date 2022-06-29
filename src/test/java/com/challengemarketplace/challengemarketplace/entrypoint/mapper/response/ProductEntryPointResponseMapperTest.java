package com.challengemarketplace.challengemarketplace.entrypoint.mapper.response;

import com.challengemarketplace.challengemarketplace.entrypoint.model.response.ProductModelResponse;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductEntryPointResponseMapperTest {

    @Test
    void convertProduct() {
        Product mockProduct = mockProduct();

            ProductModelResponse productModelResponse = ProductEntryPointResponseMapper.convertProduct(mockProduct);

            assertNotNull(productModelResponse);
            assertAll(
                    () -> assertEquals(1L, productModelResponse.getIdProduct()),
                    () -> assertEquals("Iphone12", productModelResponse.getNameProduct()),
                    () -> assertEquals("16GB", productModelResponse.getDescriptionProduct()),
                    () -> assertEquals("Apple", productModelResponse.getProductBrand()),
                    () -> assertEquals(100.0, productModelResponse.getPrice()),
                    () -> assertTrue(productModelResponse.getActive()),
                    () -> assertFalse(productModelResponse.getProductOffered())
            );
        }

    private Product mockProduct() {
        return Product.builder()
                .idProduct(1L)
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .productBrand("Apple")
                .price(100.0)
                .active(true)
                .ProductOffered(false)
                .discountPorcentage(0)
                .build();
    }
}