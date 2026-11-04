package org.example.arquitetura.desing_software.desafios_02.ex01;

import java.math.BigDecimal;

public class Order {
    private String name;
    private double price;
    private DeliveryType deliveryType;
    private OrderStatus orderStatus;

    public Order(String name, double price, DeliveryType deliveryType, OrderStatus orderStatus) {
        this.name = name;
        this.price = price;
        this.deliveryType = deliveryType;
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public double getPrice() {
        return price;
    }
}
