package org.example.java.N9.modelagem_objetos_responsabilidade.ex03;

public class CartItem {
    private String name;
    private double unitPrice;
    private int quantity;


    public CartItem(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
