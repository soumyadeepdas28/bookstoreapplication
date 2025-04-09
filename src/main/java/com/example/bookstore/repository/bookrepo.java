package com.example.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.entity.book;

public interface bookrepo extends JpaRepository<book,Integer>{

   

    
}


