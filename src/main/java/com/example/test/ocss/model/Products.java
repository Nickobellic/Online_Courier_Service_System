package com.example.test.ocss.model;
import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long prodID;

    @Column(name = "name", nullable = false)
    private String prodName;

    @Column(name = "description", nullable = false)
    private String prodDesc;

    @Column(name = "price", nullable = false)
    private Float prodPrice;

    @Column(name="stock", nullable = false)
    private int prodStock;

    @Column(name="created_at", nullable = false)
    private String prodCreate;

    @Column(name="updated_at", nullable = false)
    private String prodUpdate;

    public String getProdName() {
        return this.prodName;
    }

    public void setProdName(String name) {
        this.prodName = name;
    }    


    public String getProdDesc() {
        return this.prodDesc;
    }

    public void setProdDesc(String desc){
        this.prodDesc =desc;
    }


    public float getProdPrice() {
        return this.prodPrice;
    }

    public void setProdPrice(float price) {
        this.prodPrice = price;
    }

    public int getProdStock() {
        return this.prodStock;
    }

    public void setProdStock(int stock) {
        this.prodStock = stock;
    }


    public String getProdCreateData() {
        return this.prodCreate;
    }

    public void setProdCreateDate(String date) {
        this.prodCreate = date;
    }


    public String getProdUpdateData() {
        return this.prodUpdate;
    }


    public void setProdUpdateDate(String date) {
        this.prodUpdate = date;
    }

}
