package org.example.arquitetura.desing_software.desafios.ex02;

public class Order {
    private String name;
    private double totalOrder;
    private StatusOrder statusOrder;

    public Order(String name, double totalOrder, StatusOrder statusOrder) {
        this.name = name;
        this.totalOrder = totalOrder;
        this.statusOrder = statusOrder;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public double getTotalOrder() {
        return totalOrder;
    }
}
