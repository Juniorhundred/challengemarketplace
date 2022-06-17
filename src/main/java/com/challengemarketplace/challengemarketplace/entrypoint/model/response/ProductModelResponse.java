package com.challengemarketplace.challengemarketplace.entrypoint.model.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductModelResponse {

        private Long idProduct;
        private String nameProduct;
        private String descriptionProduct;
        private String productBrand;
        private Double price;
        private Boolean active;
        private Boolean ProductOffered;
}
