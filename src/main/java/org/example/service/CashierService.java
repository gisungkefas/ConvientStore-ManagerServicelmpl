package org.example.service;

import org.example.model.Customer;
import org.example.model.Product;

public interface CashierService {

    String receivePayment(Customer customer);
    String issueReceipt(Customer customer, Product product);
}
