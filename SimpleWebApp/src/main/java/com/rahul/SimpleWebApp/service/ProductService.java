package com.rahul.SimpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import com.rahul.SimpleWebApp.model.Product;

public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(100, "Iphone", 5000),
        new Product(101, "Samsung", 4000),
        new Product(102, "OnePlus", 3000));

    public List<Product> getProducts(){
        return products;
    }
}
