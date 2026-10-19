package org.example.arquitetura.desing_software.observer.ex04_01;

public class EmailService implements OrderObserver{
    @Override
    public void onOrderCreated(Order order) {
        System.out.println("Sending confirmation email");
    }
}
