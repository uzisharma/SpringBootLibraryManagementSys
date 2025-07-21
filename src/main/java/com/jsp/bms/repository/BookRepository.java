package com.jsp.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.bms.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
