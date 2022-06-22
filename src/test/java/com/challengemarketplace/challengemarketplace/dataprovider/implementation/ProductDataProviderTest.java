package com.challengemarketplace.challengemarketplace.dataprovider.implementation;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
import com.challengemarketplace.challengemarketplace.dataprovider.repository.ProductRepository;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
class ProductDataProviderTest {

    @InjectMocks
    private ProductDataProvider productDataProvider;

    @Mock
    private ProductRepository productRepository;

    @Test
    void findByNameSuccessfull() {
        Product produtoRequest = mockProduto();
        ProductEntity productResponse = mockProductEntity();

        given(productRepository.findByName(produtoRequest.getNameProduct()))
                .willReturn(Optional.of(productResponse));

        Optional<Product> product = productDataProvider.findByName(produtoRequest.getNameProduct());

        assertTrue(product.isPresent());
        assertAll(
                () -> assertEquals(1L, product.get().getIdProduct()),
                () -> assertEquals("Iphone12", product.get().getNameProduct()),
                () -> assertEquals("16GB", product.get().getDescriptionProduct()),
                () -> assertEquals("Apple", product.get().getProductBrand()),
                () -> assertEquals(100.0, product.get().getPrice()),
                () -> assertTrue(product.get().getActive()),
                () -> assertFalse(product.get().getProductOffered()),
                () -> assertEquals(0, product.get().getDiscountPorcentage()
                ));

    }

    @Test
    void createProductSuccessfull() {
        ProductEntity productResponse = mockProductEntity();
        Product productRequest = mockProduto();

        given(productRepository.save(Mockito.any())).willReturn(productResponse);

        Product product = productDataProvider.createProduct(productRequest);

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


    private Product mockProduto() {
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