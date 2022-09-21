package org.example.service.ServiceImpl;

import org.example.model.Product;
import org.example.service.ProductService;

import java.util.ArrayList;

public class ProductServiceImp implements ProductService {

    ArrayList<Product> products = new ArrayList<>();



    @Override
    public String addProduct() {

        Product product = new Product();
        product.setProductTitle("Sugar");
        product.setPrice(2000.00);
        product.setId(1L);
        product.setExpiryDate("2022/2/3");

        products.add(product);

        Product product1 = new Product();
        product1.setProductTitle("Milk");
        product1.setPrice(5000.00);
        product1.setId(1L);
        product1.setExpiryDate("2022/2/3");

        products.add(product1);


        Product product2 = new Product();

        product1.setProductTitle("Milo");
        product1.setPrice(1000.00);
        product1.setId(1L);
        product1.setExpiryDate("2022/2/3");

        products.add(product2);

        return "Product Added Successfully";
    }
}
