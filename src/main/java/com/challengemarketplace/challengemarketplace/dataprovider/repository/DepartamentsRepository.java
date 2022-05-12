package com.challengemarketplace.challengemarketplace.dataprovider.repository;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.DepartamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentsRepository
        extends JpaRepository<DepartamentEntity, Long> {

}

