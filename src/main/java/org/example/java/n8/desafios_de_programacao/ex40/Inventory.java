package org.example.java.n8.desafios_de_programacao.ex40;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(String name, int quantity){
        int index = findProductByName(name);
        if(index == -1){
            productList.add(new Product(name,quantity));
        }else{
            productList.get(index).increasesQuantity(quantity);
        }
    }
    public void removeProduct(String name, int quantity){
        int index = findProductByName(name);
        if(index != -1){
            productList.get(index).decreasesQuantity(quantity);
        }
    }

    public String status(){
        return stringToList();
    }


    private int findProductByName(String name){
        for (int i = 0; i <= productList.size() -1 ; i++) {
            if(productList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i <= productList.size() -1; i++){
            if(i == productList.size() -1){
                sb.append(productList.get(i).toString());
            }else {
                sb.append(productList.get(i).toString()+", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
