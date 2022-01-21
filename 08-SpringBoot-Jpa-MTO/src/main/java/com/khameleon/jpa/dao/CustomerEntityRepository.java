package com.khameleon.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khameleon.jpa.entities.CustomerEntity;

@Repository
public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {

}
