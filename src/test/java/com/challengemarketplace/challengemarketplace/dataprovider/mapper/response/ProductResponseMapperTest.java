package com.challengemarketplace.challengemarketplace.dataprovider.mapper.response;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductResponseMapperTest {

    @Test
    void converterEntityDomain() {
        ProductEntity mockProductEntity = mockProductEntity();
        Product product = ProductResponseMapper.convertEntityDomain(mockProductEntity);
        assertNotNull(product);
        assertAll(
                () -> assertEquals(1L, product.getIdProduct()),
                () -> assertEquals("Iphone12", product.getNameProduct()),
                () -> assertEquals("16GB", product.getDescriptionProduct()),
                () -> assertEquals("Apple", product.getProductBrand()),
                () -> assertEquals(100.0, product.getPrice()),
                () -> assertTrue(product.getActive()),
                () -> assertFalse(product.getProductOffered()),
                () -> assertEquals(0, product.getDiscountPorcentage())

        );
    }

    private ProductEntity mockProductEntity() {
        return ProductEntity.builder()
                .idProduct(1L)
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .productBrand("Apple")
                .priceProduct(100.00)
                .productActive(true)
                .productOffered(false)
                .discountPorcentage(0)
                .build();
    }
}