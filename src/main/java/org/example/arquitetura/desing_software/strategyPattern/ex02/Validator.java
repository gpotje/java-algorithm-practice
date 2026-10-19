package org.example.arquitetura.desing_software.strategyPattern.ex02;

public class Validator implements OrderValidator{
    @Override
    public boolean orderValidator(Order order) {
        return order.isEmpty();
    }
}
