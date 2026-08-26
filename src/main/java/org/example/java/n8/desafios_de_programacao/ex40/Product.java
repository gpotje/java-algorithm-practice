package org.example.java.n8.desafios_de_programacao.ex40;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void decreasesQuantity(int q){
        if(this.quantity - q >= 0){
            this.quantity = quantity - q;
        }
    }

    public void increasesQuantity(int q){
        this.quantity = quantity + q;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +" (" +quantity+ ") ";
    }
}
