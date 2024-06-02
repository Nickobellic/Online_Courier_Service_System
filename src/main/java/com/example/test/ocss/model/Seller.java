package com.example.test.ocss.model;
import java.util.Objects;

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
        return sellerID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

}
