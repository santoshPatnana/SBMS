package com.khameleon.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khameleon.jpa.entity.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
