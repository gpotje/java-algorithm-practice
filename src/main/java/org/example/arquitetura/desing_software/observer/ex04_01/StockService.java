package org.example.arquitetura.desing_software.observer.ex04_01;

public class StockService implements OrderObserver{
    @Override
    public void onOrderCreated(Order order) {
        System.out.println("Updating stock");
    }
}
