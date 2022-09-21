package org.example.model;



public class Customer extends Staff{


    public Customer() {

    }

    private Boolean isBuy = false;


    public Boolean getBuy() {
        return isBuy;
    }

    public void setBuy(Boolean buy) {
        isBuy = buy;
    }





    private String productToBuy;

    private Integer quantityToBuy;


    public Integer getQuantityToBuy() {
        return quantityToBuy;
    }

    public void setQuantityToBuy(Integer quantityToBuy) {
        this.quantityToBuy = quantityToBuy;
    }

    public void setProductToBuy(String productToBuy) {
        this.productToBuy = productToBuy;
    }

    public String getProductToBuy() {
        return productToBuy;
    }






}
