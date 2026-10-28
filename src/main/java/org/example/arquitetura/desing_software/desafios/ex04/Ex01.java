package org.example.arquitetura.desing_software.desafios.ex04;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Ana", 200.00, new Pix(), OrderStatus.PENDING),
                new Order("Carlos", 600.00, new CreditCard(), OrderStatus.PENDING),
                new Order("Maria", 400.00, new Boleto(), OrderStatus.PAID),
                new Order("João", 700.00, new Pix(), OrderStatus.CANCELLED),
                new Order("Pedro", 40.00, new CreditCard(), OrderStatus.PENDING),
                new Order("Luiza", 500.00, new Boleto(), OrderStatus.PENDING),
                new Order("Bruno", 550.00, new Pix(), OrderStatus.PENDING)
        );

        ServicePayment service = new ServicePayment(20.00);
        OrderFinalDto dto = service.calculateOrder(orders);
        System.out.println(dto.toString());
    }
}
