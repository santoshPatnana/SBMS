package com.ashokit.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.jpa.entities.CustomerEntity;

@Repository
public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {

}
