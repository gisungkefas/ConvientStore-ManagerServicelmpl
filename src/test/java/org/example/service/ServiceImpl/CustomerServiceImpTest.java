package org.example.service.ServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Wallet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CustomerServiceImpTest {
    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:18)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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
        Product product = new Product();
        customerServiceImp.purchase(customer, product, new Wallet());
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    void testPurchase2() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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

        Product product = new Product();
        product.setQuantity(1);
        assertEquals("Product is Empty", customerServiceImp.purchase(customer, product, new Wallet()));
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:18)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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
        customerServiceImp.purchase(customer, null, new Wallet());
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:18)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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
        customer.setQuantityToBuy(null);
        customer.setQuery(1);

        Product product = new Product();
        product.setQuantity(1);
        customerServiceImp.purchase(customer, product, new Wallet());
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    void testPurchase5() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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

        Product product = new Product();
        product.setQuantity(0);
        assertEquals("Opps Quantity is not available choose another quantity Please!",
                customerServiceImp.purchase(customer, product, new Wallet()));
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:26)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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

        Product product = new Product();
        product.setProductTitle("Dr");
        product.setQuantity(1);
        customerServiceImp.purchase(customer, product, new Wallet());
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:26)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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

        Product product = new Product();
        product.setProductTitle("Dr");
        product.setQuantity(1);
        customerServiceImp.purchase(customer, product, null);
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    void testPurchase8() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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

        Product product = new Product();
        product.setPrice(10.0d);
        product.setProductTitle("Dr");
        product.setQuantity(1);
        assertEquals("This Product is Not Available At The Moment",
                customerServiceImp.purchase(customer, product, new Wallet()));
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    void testPurchase9() {
        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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
        customer.setProductToBuy("Dr");
        customer.setQuantityToBuy(1);
        customer.setQuery(1);

        Product product = new Product();
        product.setPrice(10.0d);
        product.setProductTitle("Dr");
        product.setQuantity(1);
        Wallet wallet = new Wallet();
        assertEquals("Transactions Successful", customerServiceImp.purchase(customer, product, wallet));
        assertTrue(customer.getBuy());
        assertEquals(0, product.getQuantity().intValue());
        assertEquals(4990.0d, wallet.getBalance().doubleValue());
    }

    /**
     * Method under test: {@link CustomerServiceImp#purchase(Customer, Product, Wallet)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPurchase10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at org.example.service.ServiceImpl.CustomerServiceImp.purchase(CustomerServiceImp.java:30)
        //   In order to prevent purchase(Customer, Product, Wallet)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   purchase(Customer, Product, Wallet).
        //   See https://diff.blue/R013 to resolve this issue.

        CustomerServiceImp customerServiceImp = new CustomerServiceImp();

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
        customer.setProductToBuy(null);
        customer.setQuantityToBuy(1);
        customer.setQuery(1);

        Product product = new Product();
        product.setPrice(10.0d);
        product.setProductTitle("Dr");
        product.setQuantity(1);
        customerServiceImp.purchase(customer, product, new Wallet());
    }
}

