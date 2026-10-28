package org.example.arquitetura.desing_software.desafios.ex04;

public class Order {



    private String name;
    private double price;
    private Payment payment;
    private OrderStatus status;

    public Order(String name, double price, Payment payment, OrderStatus status) {
        this.name = name;
        this.price = price;
        this.payment = payment;
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Payment getPayment() {
        return payment;
    }

}
