package com.example.test.ocss.model;
import java.util.Objects;

import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;


@Entity
@Table(name="sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellerID;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "seller_username")
    private String sellerUserName;

    @Column(name = "seller_password")
    private String sellerPassword;

    @Column(name = "items_sold")
    private String itemsSold;

    @Column(name = "total_sales")
    private int sales;

    public Long getSellerID() {
        return this.sellerID;
    }

    // Seller Name
    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    // Seller username
    public String getSellerUserName() {
        return this.sellerUserName;
    }


    public void setSellerUsername(String sellerUsername) {
        this.sellerUserName = sellerUsername;
    }

    // Seller Password
    public String getSellerPassword() {
        return this.sellerPassword;
    }

    public void setSellerPassword(String password) {
        this.sellerPassword = password;
    }

    // Items sold
    public String getItemsSold() {
        return this.itemsSold;
    }

    public void setItemsSold(String items) {
        this.itemsSold = items;
    }

    // Total Sales
    public int getTotalSales() {
        return this.sales;
    }

    public void setTotalSales(int sales) {
        this.sales = sales;
    }

}
