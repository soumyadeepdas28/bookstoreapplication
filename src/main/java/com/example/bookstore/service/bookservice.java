package com.example.bookstore.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.entity.book;
import com.example.bookstore.repository.bookrepo;

@Service
public class bookservice {

    @Autowired
    private bookrepo BR;

    public book addBooks(book B)
    {
        return BR.save(B);

    }

    public book searchByID(int id)
    {
        Optional<book> B =BR.findById(id);

        if(B.isEmpty())
        {
            throw new RuntimeException("Book not found");
            
        }
        
        return B.get();


    }

    public  List<book> findAll()
    {
        return BR.findAll();
    }

    public book updateBook(book B)
    {
        Optional<book> dbBook =BR.findById(B.getBookid());
        if(dbBook.isEmpty())
        {
            throw new RuntimeException("Book not found");
            
        }

        book eBook = dbBook.get();
        eBook.setAuthor(B.getAuthor());
        return BR.save(B);

    }

    public void deleteBook(int id)
    {
        Optional<book> dbBook =BR.findById(id);
        if(dbBook.isEmpty())
        {
            throw new RuntimeException("Book not found");
            
        }

      
         BR.delete(dbBook.get());

    }


}
