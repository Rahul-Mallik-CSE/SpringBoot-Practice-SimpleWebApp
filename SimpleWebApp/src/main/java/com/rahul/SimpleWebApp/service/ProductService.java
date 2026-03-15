package com.rahul.SimpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.SimpleWebApp.model.Product;
import com.rahul.SimpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>( Arrays.asList(
    //     new Product(100, "Iphone", 5000),
    //     new Product(101, "Samsung", 4000),
    //     new Product(102, "OnePlus", 3000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product(0, "No Item Found", 0));
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

  

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
