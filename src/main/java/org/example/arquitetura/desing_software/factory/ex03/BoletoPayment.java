package org.example.arquitetura.desing_software.factory.ex03;

public class BoletoPayment implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("BoletoPayment "+amount);
    }
}
