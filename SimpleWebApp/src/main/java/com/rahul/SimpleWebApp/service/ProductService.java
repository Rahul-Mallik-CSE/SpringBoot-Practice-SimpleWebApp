package com.rahul.SimpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.SimpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
        new Product(100, "Iphone", 5000),
        new Product(101, "Samsung", 4000),
        new Product(102, "OnePlus", 3000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No Item Found", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
                break;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId){
        int index= 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                break;
            }
        }
        products.remove(index);
    }
}
