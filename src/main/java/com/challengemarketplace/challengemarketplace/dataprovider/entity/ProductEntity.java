package com.challengemarketplace.challengemarketplace.dataprovider.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name ="Products")
public class ProductEntity implements Serializable {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdProduct")
    private Long idProduct;

    @Column(name = "NameProduct")
    private String nameProduct;

    @Column(name = "DescriptionProduct")
    private String descriptionProduct;

    @Column(name = "ProductBrand")
    private String productBrand;

    @Column(name = "PriceProduct")
    private Double priceProduct;

    @Column(name = "UserActive")
    private Boolean userActive;

    @Column(name = "ProductOffered")
    private Boolean productOffered;

    @Column(name = "DiscountPorcentage")
    private Double discountPorcentage;
}
