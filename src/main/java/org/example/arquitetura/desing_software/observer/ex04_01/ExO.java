package org.example.arquitetura.desing_software.observer.ex04_01;

public class ExO {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Order o = new Order("TESTE",100.0);

        orderService.addObserver(new EmailService());
        orderService.addObserver(new StockService());

        orderService.createOrder(o);
    }
}
