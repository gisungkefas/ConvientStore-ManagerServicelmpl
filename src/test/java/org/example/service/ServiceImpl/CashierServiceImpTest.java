package org.example.service.ServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.example.model.Customer;
import org.junit.jupiter.api.Test;

class CashierServiceImpTest {
    /**
     * Method under test: {@link CashierServiceImp#receivePayment(Customer)}
     */
    @Test
    void testReceivePayment() {
        CashierServiceImp cashierServiceImp = new CashierServiceImp();
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setAge("Age");
        customer.setBuy(true);
        customer.setDob(LocalDateTime.of(1, 1, 1, 1, 1));
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setGender("Gender");
        customer.setLastName("Doe");
        customer.setPhoneNumber("4105551212");
        customer.setProductToBuy("Product To Buy");
        customer.setQuantityToBuy(1);
        customer.setQuery(1);
        assertEquals("Payment Has been Receive Successfully", cashierServiceImp.receivePayment(customer));
    }

    /**
     * Method under test: {@link CashierServiceImp#receivePayment(Customer)}
     */
    @Test
    void testReceivePayment2() {
        CashierServiceImp cashierServiceImp = new CashierServiceImp();
        Customer customer = new Customer();
        customer.setAddress("42 Main St");
        customer.setAge("Age");
        customer.setBuy(false);
        customer.setDob(LocalDateTime.of(1, 1, 1, 1, 1));
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setGender("Gender");
        customer.setLastName("Doe");
        customer.setPhoneNumber("4105551212");
        customer.setProductToBuy("Product To Buy");
        customer.setQuantityToBuy(1);
        customer.setQuery(1);
        assertEquals("Opps Transaction Not Successful", cashierServiceImp.receivePayment(customer));
    }
}

