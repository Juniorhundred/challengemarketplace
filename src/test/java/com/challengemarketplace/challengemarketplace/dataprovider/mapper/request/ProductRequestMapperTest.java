package com.challengemarketplace.challengemarketplace.dataprovider.mapper.request;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRequestMapperTest {

    @Test
    void converterDomainEntitySuccess() {
        Product mockProduct = mockProduct();

        ProductEntity productEntity = ProductRequestMapper.convertDomainEntity(mockProduct);

        assertNotNull(productEntity);
        assertAll(
                () -> assertEquals(1L, productEntity.getIdProduct()),
                () -> assertEquals("Iphone12", productEntity.getNameProduct()),
                () -> assertEquals("16GB", productEntity.getDescriptionProduct()),
                () -> assertEquals("Apple", productEntity.getProductBrand()),
                () -> assertEquals(100.0, productEntity.getPriceProduct()),
                () -> assertTrue(productEntity.getProductActive()),
                () -> assertFalse(productEntity.getProductOffered()),
                () -> assertEquals(0, productEntity.getDiscountPorcentage())

        );
    }

    private Product mockProduct() {
        return Product.builder()
                .idProduct(1L)
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .productBrand("Apple")
                .price(100.00)
                .active(true)
                .ProductOffered(false)
                .discountPorcentage(0)
                .build();
    }
}