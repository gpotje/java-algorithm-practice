package org.example.arquitetura.desing_software.desafios.ex02;

import  org.example.arquitetura.desing_software.desafios.ex02.Order;

import java.util.Arrays;
import java.util.List;

import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("Ana", 250.00, StatusOrder.PAID),
                new Order("Carlos", 150.00, StatusOrder.PAID),
                new Order("Maria", 300.00, StatusOrder.CANCELLED),
                new Order("João", 200.00, StatusOrder.PENDING),
                new Order("Pedro", 400.00, StatusOrder.PAID)
        };

        List<Order> orderList = Arrays.asList(orders);

        Discount d = new DiscountUnder200();
        OrderService orderService = new OrderService(d);
        CalculateOrderDto o = orderService.calculateOrder(orderList);
        System.out.println(o.toString());
    }
}
