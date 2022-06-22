package com.challengemarketplace.challengemarketplace.entrypoint.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProductModelResponse {

    private Long idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private String productBrand;
    private Double price;
    private Boolean active;
    private Boolean ProductOffered;
}
