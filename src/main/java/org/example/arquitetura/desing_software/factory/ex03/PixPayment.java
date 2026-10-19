package org.example.arquitetura.desing_software.factory.ex03;

public class PixPayment implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("PixPayment "+amount);
    }
}
