package org.example.service.ServiceImpl;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.service.CashierService;

public class CashierServiceImp implements CashierService {

    @Override
    public String receivePayment(Customer customer) {
    if(!customer.getBuy()){
        return "Opps Transaction Not Successful";
    }
    return "Payment Has been Receive Successfully";
    }

    @Override
    public String issueReceipt(Customer customer, Product product) {
        if(!customer.getBuy()){
            return "Opps Transaction Not Successful";
        }
        return "################### Transaction Receipt ######################\n" + " \t\t\t" +"Thanks for your Patronage\n\t\t\t" + "Customer Name: "
                +customer.getFirstName()+" "+ customer.getLastName() + "\n\t\t\t" +"Product Title: "+ " " +customer.getProductToBuy()+ "\n\t\t\t"+
                "Product Price: " +product.getPrice();
    }


}
