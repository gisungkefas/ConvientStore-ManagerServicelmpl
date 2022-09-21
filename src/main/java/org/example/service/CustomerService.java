package org.example.service;

import org.example.model.Cashier;
import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Wallet;

public interface CustomerService {

    String purchase(Customer customer, Product product, Wallet wallet);
    String getReceipt(Cashier cashier);

    String creditWallet(Double amount, Wallet wallet);

}
