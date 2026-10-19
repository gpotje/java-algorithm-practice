package org.example.arquitetura.desing_software.observer.ex04_01;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private final List<OrderObserver> observers = new ArrayList<>();


    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }


    public void createOrder(Order order) {
        System.out.println("Order created");

        for (OrderObserver observer : observers) {
            observer.onOrderCreated(order);
        }
    }

}
