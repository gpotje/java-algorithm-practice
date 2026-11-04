package org.example.arquitetura.desing_software.desafios_02.ex01;

import java.math.BigDecimal;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Ana", 200.00, DeliveryType.STANDARD, OrderStatus.PENDING),
                new Order("Carlos", 800.00, DeliveryType.EXPRESS, OrderStatus.PAID),
                new Order("Maria", 450.00, DeliveryType.PICKUP, OrderStatus.PAID),
                new Order("João", 700.00, DeliveryType.STANDARD, OrderStatus.CANCELLED),
                new Order("Pedro", 80.00, DeliveryType.EXPRESS, OrderStatus.PENDING),
                new Order("Luiza", 500.00, DeliveryType.EXPRESS, OrderStatus.PENDING),
                new Order("Bruno", 1000.00, DeliveryType.PICKUP, OrderStatus.PAID),
                new Order("Fernanda", 150.00, DeliveryType.STANDARD, OrderStatus.PENDING)
        );

        OrderService service = new OrderService();
        ResponseOrderDto dto = service.calculateOrder(orders);
        System.out.println(dto.toString());
    }
}
