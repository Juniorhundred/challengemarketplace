package com.challengemarketplace.challengemarketplace.dataprovider.repository;

import com.challengemarketplace.challengemarketplace.dataprovider.entity.DepartamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentRepository
        extends JpaRepository<DepartamentEntity, Long> {
}

