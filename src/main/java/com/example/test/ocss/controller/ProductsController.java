package com.example.test.ocss.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.ocss.model.Products;
import com.example.test.ocss.service.ProductsService;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductsController {

    @Autowired
    public ProductsService productService;

    @GetMapping("/get-products")
    public Optional<Products> getProducts() {
        return productService.getAllProducts();
    }
    


}
