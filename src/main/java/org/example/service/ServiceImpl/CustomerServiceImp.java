package org.example.service.ServiceImpl;

import org.example.model.Cashier;
import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Wallet;
import org.example.service.CustomerService;

public class CustomerServiceImp implements CustomerService {





    @Override
    public String purchase(Customer customer, Product product, Wallet wallet) {

    if(product.getQuantity() < customer.getQuantityToBuy()){
        return "Opps Quantity is not available choose another quantity Please!";
    }

    if(product.getProductTitle() == null){
        return "Product is Empty";
    }

    if(wallet.getBalance() < product.getPrice()){
        return "Insufficient Balance Please Fund Your Wallet First and Try Again!";
    }

    if(!customer.getProductToBuy().equals(product.getProductTitle())){
        return "This Product is Not Available At The Moment";
    }

    Double amountDebited = wallet.getBalance()- product.getPrice();
    wallet.setBalance(amountDebited);
    Integer qty = product.getQuantity() -1;
    product.setQuantity(qty);

       customer.setBuy(true);
       return "Transactions Successful";
    }

    @Override
    public String getReceipt(Cashier cashier) {

        return null;
    }

    @Override
    public String creditWallet(Double amount, Wallet wallet) {
       wallet.setBalance(amount);
        return "Wallet Credited Successfully";
    }
}
