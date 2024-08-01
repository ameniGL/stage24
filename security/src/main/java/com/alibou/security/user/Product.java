package com.alibou.security.user;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class Product {
    private String title;
    private String price;
    private double rating;
    private String imageUrl;
    private String Link  ;
    public Product(String title, String price, double rating , String imageUrl , String Link) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl ;
        this.Link = Link ;
    }

}