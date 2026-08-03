package org.example.java.n7.logica.ex23;

import java.util.ArrayList;
import java.util.List;

public class
Order {
    private List<Product> products;
    private String name;

    public Order(String name) {
        this.products = new ArrayList<>();
        this.name = name;
    }

    public void addOrder(String name, String p) {
        if(this.products == null){
            this.products = new ArrayList<>();
        }
        this.products.add(new Product(p));
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}
