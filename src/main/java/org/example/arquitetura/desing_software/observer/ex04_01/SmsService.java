package org.example.arquitetura.desing_software.observer.ex04_01;

public class SmsService implements OrderObserver{
    @Override
    public void onOrderCreated(Order order) {
        System.out.println("SmsService.......");
    }
}
