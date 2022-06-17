package com.challengemarketplace.challengemarketplace.entrypoint.model.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductModelRequest {

        private String nameProduct;
        private String descriptionProduct;
        private String productBrand;
        private Double price;
        private Boolean active;
        private Boolean ProductOffered;
    }

