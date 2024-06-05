package com.example.test.ocss.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.ocss.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>  {

    @Query(nativeQuery = true, value = "SELECT * FROM products")
    Optional<Products> getAllProducts();
    
}
