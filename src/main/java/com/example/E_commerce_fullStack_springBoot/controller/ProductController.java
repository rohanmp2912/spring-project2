package com.example.E_commerce_fullStack_springBoot.controller;

import com.example.E_commerce_fullStack_springBoot.model.Product;
import com.example.E_commerce_fullStack_springBoot.service.ProductService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProductById(id);
    }
}
