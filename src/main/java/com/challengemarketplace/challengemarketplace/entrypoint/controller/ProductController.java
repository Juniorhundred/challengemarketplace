package com.challengemarketplace.challengemarketplace.entrypoint.controller;

import com.challengemarketplace.challengemarketplace.dataprovider.repository.ProductRepository;
import com.challengemarketplace.challengemarketplace.entrypoint.mapper.request.ProductEntryPointRequestMapper;
import com.challengemarketplace.challengemarketplace.entrypoint.mapper.response.ProductEntryPointResponseMapper;
import com.challengemarketplace.challengemarketplace.entrypoint.model.request.ProductModelRequest;
import com.challengemarketplace.challengemarketplace.entrypoint.model.response.ProductModelResponse;
import com.challengemarketplace.challengemarketplace.usecase.domain.Product;
import com.challengemarketplace.challengemarketplace.usecase.service.ProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challengebrq/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductUseCase productUseCase;

    @Autowired
    private ProductRepository productRepository;


    @PostMapping
    public ResponseEntity<ProductModelResponse> createProduct
            (@RequestBody ProductModelRequest productModelRequest){

        Product productRequest = ProductEntryPointRequestMapper.convertProduct(productModelRequest);
        Product productResponse = productUseCase.createProduct(productRequest);

        ProductModelResponse productModelResponse = ProductEntryPointResponseMapper.convertProduct(productResponse);
        return  new ResponseEntity<>(productModelResponse, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<ProductModelResponse>>listProducts(ProductModelRequest productModelRequest){
        Product productRequest = ProductEntryPointRequestMapper.convertProduct(productModelRequest);
        List<Product> productResponse = productUseCase.findListProducts(productRequest);

        List<ProductModelResponse>productModelResponse = ProductEntryPointResponseMapper.convertList(productResponse);
        return ResponseEntity.ok(productModelResponse);
    }
}
