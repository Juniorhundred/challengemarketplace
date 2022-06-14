package com.challengemarketplace.challengemarketplace.usecase.service;

import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.CheckPriceError;
import com.challengemarketplace.challengemarketplace.usecase.exceptions.ValidationDuplicityNameException;
import com.challengemarketplace.challengemarketplace.usecase.gateway.ProductGateway;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
class ProductUseCaseImplTest {

    @InjectMocks
    private ProductUseCaseImpl productUseCaseImpl;

    @Mock
    private ProductGateway productGateway;

    @Test
    void testCreateProductSuccesful() {
        Product productToBeCreated = mockProductRequest(100.00);
        Product productCreated = mockProductResponse();

        given(productGateway
                .findByName(productToBeCreated
                        .getNameProduct()))
                .willReturn(Optional.empty());
        given(productGateway.createProduct(productToBeCreated))
                .willReturn(productCreated);

        Product product = productUseCaseImpl
                .createProduct(productToBeCreated);

        assertNotNull(product);
        assertAll(
                () -> assertEquals(1L, product.getIdProduct()),
                () -> assertEquals("Iphone12", product.getNameProduct()),
                () -> assertEquals("16GB", product.getDescriptionProduct()),
                () -> assertEquals(100.00, product.getPrice())

        );
    }

    @Test
    void testProductNameDuplicitySuccesful() {
        Product productToBeCreated = mockProductRequest(100.00);

        given(productGateway
                .findByName(productToBeCreated.getNameProduct()))
                .willReturn(Optional
                        .of(mockProductResponse()));

        assertThrows(ValidationDuplicityNameException.class,
                () -> productUseCaseImpl.createProduct(productToBeCreated));
    }

    @Test
    void testPriceZeroedOrNegativeSuccesful() {
        Product productToBeCreated = mockProductRequest(-100.00);
        assertThrows(CheckPriceError.class,
                () -> productUseCaseImpl.createProduct(productToBeCreated));
    }

    @Test
    void testPriceZeroedOrNegativeSuccesfully() {
        Product productToBeCreated = mockProductRequest(0.00);
        assertThrows(CheckPriceError.class,
                () -> productUseCaseImpl.createProduct(productToBeCreated));

    }

    private Product mockProductRequest(Double price) {
        return Product.builder()
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .price(price)
                .build();

    }

    private Product mockProductResponse() {
        return Product.builder()
                .idProduct(1L)
                .nameProduct("Iphone12")
                .descriptionProduct("16GB")
                .productBrand("Apple")
                .price(100.00)
                .active(true).ProductOffered(false)
                .discountPorcentage(0)
                .build();
    }


}