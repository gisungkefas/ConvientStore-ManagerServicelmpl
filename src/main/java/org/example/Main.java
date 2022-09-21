package org.example;

import org.example.model.Applicant;
import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Wallet;
import org.example.service.ServiceImpl.CashierServiceImp;
import org.example.service.ServiceImpl.CustomerServiceImp;
import org.example.service.ServiceImpl.ManagerServiceImpl;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();


        customer.setFirstName("Kefas");
        customer.setLastName("Gisung");
        customer.setAddress("edo state");
        customer.setEmail("suleiman@gmail.com");
        customer.setGender("male");
        customer.setProductToBuy("sugar");
        customer.setQuantityToBuy(5);






        Product product = new Product();
        product.setProductTitle("sugar");
        product.setPrice(2000.00);
        product.setId(1L);
        product.setExpiryDate("2022/2/3");
        product.setQuantity(10);

        CustomerServiceImp serviceImp = new CustomerServiceImp();
        Wallet wallet = new Wallet();
        serviceImp.creditWallet(5000.00, wallet);
        System.out.println(serviceImp.purchase(customer, product, wallet));


        CashierServiceImp cashiers = new CashierServiceImp();

        System.out.println(cashiers.receivePayment(customer));
        System.out.println(cashiers.issueReceipt(customer,product));

        System.out.println("#######################################################################");
        Applicant applicant = new Applicant();

        applicant.setQualification("2.1");
        applicant.setYearsOfExperience(5);
        applicant.setFirstName("Kefas");
        applicant.setLastName("Gisung");
        applicant.setAge("30");
        applicant.setGender("male");
        applicant.setEmail("sule@gmail.com");
        applicant.setAddress("edo state");

        ManagerServiceImpl managerService = new ManagerServiceImpl();
        System.out.println(managerService.hire(applicant));

    }
}