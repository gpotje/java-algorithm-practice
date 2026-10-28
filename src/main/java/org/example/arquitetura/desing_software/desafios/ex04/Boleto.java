package org.example.arquitetura.desing_software.desafios.ex04;

public class Boleto implements Payment{
    @Override
    public DiscountAdditionDto paymentWithDiscount(double d) {
        return new DiscountAdditionDto(0.0,0.0);
    }
}
