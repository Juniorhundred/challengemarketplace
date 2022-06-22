package com.challengemarketplace.challengemarketplace.dataprovider.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "Departaments_Of_Marketplace")
public class DepartamentEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    @Column(name = "IdDepartament")
    private Long idDepartament;


    @Column(name = "NameDepartament")
    private String nameDepartament;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartamentEntity that = (DepartamentEntity) o;
        return idDepartament.equals(that.idDepartament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepartament);
    }
}
