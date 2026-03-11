package com.rahul.SimpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.SimpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(100, "Iphone", 5000),
        new Product(101, "Samsung", 4000),
        new Product(102, "OnePlus", 3000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
}
