package org.example.arquitetura.desing_software.strategyPattern.ex02;

public class Repository implements OrderRepository{
    @Override
    public void createOrder(Order order) {
        System.out.println("======= order saved ========");
    }
}
