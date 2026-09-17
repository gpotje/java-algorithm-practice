package org.example.java.N9.modelagem_objetos_responsabilidade.ex01;

public class Item {
    private String name;
    private double price;


    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }
}
