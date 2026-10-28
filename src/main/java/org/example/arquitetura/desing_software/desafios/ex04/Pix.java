package org.example.arquitetura.desing_software.desafios.ex04;

public class Pix implements Payment{

    @Override
    public DiscountAdditionDto paymentWithDiscount(double d) {
        return new DiscountAdditionDto(d*0.05,0.0);
    }
}
