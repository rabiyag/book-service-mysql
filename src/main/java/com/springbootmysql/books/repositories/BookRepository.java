package com.springbootmysql.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmysql.books.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

} 