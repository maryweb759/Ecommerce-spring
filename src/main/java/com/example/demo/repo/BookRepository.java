package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	 @Query("SELECT sum(price) from Book")
	 String findSum();

}
