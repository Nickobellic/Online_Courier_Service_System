package com.example.test.ocss.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.ocss.model.Seller;
import com.example.test.ocss.repository.SellerRepository;

@Service
public class SellerService {
    
    @Autowired
    public SellerRepository sellerRepo;

    public Seller saveSellerDetails(Seller seller) {
        return sellerRepo.save(seller);
    }
}
