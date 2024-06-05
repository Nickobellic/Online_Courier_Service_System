package com.example.test.ocss.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.ocss.model.Products;
import com.example.test.ocss.repository.ProductsRepository;

@Service
public class ProductsService {
    
    @Autowired
    public ProductsRepository prodRepo;

    public Products saveSellerDetails(Products products) {
        return prodRepo.save(products);
    }

    public Optional<Products> getAllProducts() {
        return prodRepo.getAllProducts();
    }
}
