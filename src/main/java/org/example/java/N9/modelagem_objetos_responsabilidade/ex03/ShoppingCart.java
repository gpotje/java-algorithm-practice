package org.example.java.N9.modelagem_objetos_responsabilidade.ex03;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem i){
        int index = findItem(i.getName());
        if(index == -1){
            items.add(i);
        }else{
            items.get(index).addQuantity(i.getQuantity());
        }
    }

    public void removeItem(String name){
        int index = findItem(name);
        if(index != -1){
            items.remove(index);
        }
    }

    public double calculateTotal(){
        double sum = 0.0;
        int totalQuantity = 0;
        for(CartItem ci: items ){
            sum += ci.getUnitPrice() * ci.getQuantity();
            totalQuantity += ci.getQuantity();
        }
        if (totalQuantity >= 10) {
            sum *= 0.85;
        } else if (totalQuantity >= 5) {
            sum *= 0.95;
        }
        return sum;
    }




    private int findItem(String name){
        for (int i = 0; i <= this.items.size() -1;i++){
            if(items.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
