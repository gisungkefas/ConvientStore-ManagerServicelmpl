package org.example.model;

public class Wallet {

    private Double balance = 5000.00;

    public Double getBalance() {
        return balance;
    }

    public Wallet() {
    }

    public Wallet(Double balance) {
        this.balance = balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
