package com.ashokit.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.jpa.entities.BookEntity;

@Repository
public interface BookEntityRepository extends JpaRepository<BookEntity, Integer> {

}
