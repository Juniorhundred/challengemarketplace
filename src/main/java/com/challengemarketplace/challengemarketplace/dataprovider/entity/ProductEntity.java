package com.challengemarketplace.challengemarketplace.dataprovider.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Builder
@Table(name ="Products")
@NoArgsConstructor
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

    @Column(name = "ProductActive")
    private Boolean productActive;

    @Column(name = "ProductOffered")
    private Boolean productOffered;

    @Column(name = "DiscountPorcentage")
    private Integer discountPorcentage;

    @ManyToMany
    @JoinTable(
            name = "Products_Departaments",
            joinColumns = @JoinColumn(name = "IdProduct"),
            inverseJoinColumns = @JoinColumn(name = "IdDepartament")
    )
    private List<DepartamentEntity> departaments = new ArrayList<>();


}
