package com.example.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="books")
@Getter
@Setter
public class book {

    @Id
    private int bookid;

    private String title;

    private String author;

    private double price;

    private int rating;

    

 

}
