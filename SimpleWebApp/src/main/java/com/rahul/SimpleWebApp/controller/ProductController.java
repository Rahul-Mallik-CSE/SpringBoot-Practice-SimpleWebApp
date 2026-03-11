package com.rahul.SimpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.SimpleWebApp.model.Product;
import com.rahul.SimpleWebApp.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class ProductController {

    @Autowired
    ProductService service;

   
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(int prodId){
        return service.getProductById(prodId);
    }
}
