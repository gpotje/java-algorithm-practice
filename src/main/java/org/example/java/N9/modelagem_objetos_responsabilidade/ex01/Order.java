package org.example.java.N9.modelagem_objetos_responsabilidade.ex01;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private OrderStatus status;

    private void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order() {
        this.items = new ArrayList<>();
        status = OrderStatus.PENDING;

    }
    public OrderStatus getStatus() {
        return status;
    }
    public void addItem(Item item) {
        if (this.status == OrderStatus.PENDING) {
            items.add(item);
        }
    }

    public double calculateTotal(){

        double sum = 0.0;

        for (Item i : items){

            sum=+ i.getPrice();

        }

        return sum;

    }

    public void pay(){

        if(!items.isEmpty()){

            setStatus(OrderStatus.PAID);

        }

    }



    public void cancel(){

        if(this.status == OrderStatus.PENDING){

            setStatus(OrderStatus.CANCELLED);

        }

    }



    private int findItemByName(String name){

        for (int i = 0; i <= items.size() -1 ; i++) {

            if(items.get(i).getName().equals(name)){

                return i;

            }

        }

        return -1;

    }
}
