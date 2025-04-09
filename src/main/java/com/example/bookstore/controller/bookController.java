package com.example.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.entity.book;
import com.example.bookstore.service.bookservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class bookController {

    @Autowired
    private bookservice bs;

    @PostMapping("/save")
    public book save(@RequestBody book B)
    {
        return bs.addBooks(B);
    }

    @GetMapping("/findAll")
    public List<book> findAll() {
        return bs.findAll();
    }

    @GetMapping("/searchByID")
    public book searchByID(@RequestParam int id) {
        return bs.searchByID(id);
    }

    @PutMapping("/update")
    public book  update(@RequestBody book B) {
       
        
        return bs.updateBook(B);
    }

    @DeleteMapping("/deleteById")
    public void delete(@RequestParam int id)
    {
        bs.deleteBook(id);
    }
    
    

}
