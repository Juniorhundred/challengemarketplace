package com.challengemarketplace.challengemarketplace.usecase.domain;

import lombok.Data;
@Data
public class Product {

    private Long idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private String productBrand;
    private Double price;
    private Boolean active;
    private Boolean ProductOffered;
    private Double discountPorcentage;
}
