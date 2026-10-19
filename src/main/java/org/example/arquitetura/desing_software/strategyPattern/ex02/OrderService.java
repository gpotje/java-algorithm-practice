package org.example.arquitetura.desing_software.strategyPattern.ex02;

public class OrderService {

    private final OrderValidator validator;
    private final OrderRepository repository;

    public OrderService(
            OrderValidator validator,
            OrderRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }

    public void createOrder(Order order) {

        if(!validator.orderValidator(order)){
            throw new RuntimeException("Order cannot be empty");
        }

        repository.createOrder(order);
    }
}
