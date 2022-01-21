package com.khameleon.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khameleon.jpa.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
