package com.challengemarketplace.challengemarketplace.dataprovider.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Getter
//@Setter
@Entity
@Table(name = "Departaments_Of_Marketplace")
public class DepartamentEntity{

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdDepartament")
    private Long idDepartament;

    @Column(name = "NameDepartament")
    private String nameDepartament;
}
