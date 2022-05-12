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
public class DepartamentEntity  {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Departament")
    private Long idDepartament;




    @Column(name = "Name_Departament" )
    private String nameDepartament;

}

