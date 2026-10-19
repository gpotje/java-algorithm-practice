package org.example.arquitetura.desing_software.strategyPattern.ex02;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String nameCostumer;
    private List<String> items;

    public Order(String nameCostumer) {
        this.nameCostumer = nameCostumer;
        this.items = new ArrayList<>();
    }

    public void addOrder(String nameProduct){
        items.add(nameProduct);
    }

    public boolean isEmpty(){
        if(items.isEmpty()){
            return false;
        }
        return true;
    }
}
