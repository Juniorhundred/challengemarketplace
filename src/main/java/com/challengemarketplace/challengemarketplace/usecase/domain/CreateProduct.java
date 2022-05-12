package com.challengemarketplace.challengemarketplace.usecase.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateProduct {

    private Long IdProduct;
    private String NameProduct;
    private String DescProduct;
    private String ProductBrand;
    private Double Price;
    private Boolean Active;
    private Double Offered;
    private Double OffePorcentage;



}

