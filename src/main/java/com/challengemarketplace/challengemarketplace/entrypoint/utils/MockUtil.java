//package com.challengemarketplace.challengemarketplace.entrypoint.utils;
//
//import com.challengemarketplace.challengemarketplace.dataprovider.entity.ProductEntity;
//import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
//import com.challengemarketplace.challengemarketplace.usecase.service.ProductUseCaseImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MockUtil {
//    @Autowired
//    private ProductUseCaseImpl productUseCaseImpl;
//
//    public Product product(){
//        Product productMock = productUseCaseImpl
//                .createProduct(ProductEntity.builder()
//                        .nameProduct("Iphone 12 ProMax").build());
//        return productMock();
//    }
//
//}
