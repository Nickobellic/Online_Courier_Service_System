package com.example.test.ocss.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.ocss.model.Seller;
import com.example.test.ocss.service.SellerService;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SellerController {

    @Autowired
    public SellerService sellerService;

    @PostMapping("/new-seller")    
    public void postSellerDetails(@RequestBody com.fasterxml.jackson.databind.JsonNode value) {
        Seller seller = new Seller();
        String sellerName = value.get("seller_name").asText();
        String sellerUserName = value.get("seller_username").asText();
        String sellerPassword = value.get("seller_password").asText();

        seller.setSellerName(sellerName);
        seller.setSellerUsername(sellerUserName);
        seller.setSellerPassword(sellerPassword);
        seller.setItemsSold("");
        seller.setTotalSales(0);

        sellerService.saveSellerDetails(seller);
    }

}
