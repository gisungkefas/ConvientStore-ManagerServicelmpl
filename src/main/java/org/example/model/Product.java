package org.example.model;

import java.time.LocalDateTime;

public class Product {

    private Long id;
    private String productTitle;
    private Double price;
    private String expiryDate;

    private Integer quantity;


    public Product(Long id, String productTitle, Double price, String expiryDate) {
        this.id = id;
        this.productTitle = productTitle;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
