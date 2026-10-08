package org.example.arquitetura.desing_software.factory.ex01;

public class CreditCardPayment implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("CreditCardPayment "+amount);
    }
}
