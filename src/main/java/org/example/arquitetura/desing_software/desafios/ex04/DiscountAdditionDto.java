package org.example.arquitetura.desing_software.desafios.ex04;

public class DiscountAdditionDto {
    private double discount;
    private double addition;

    public DiscountAdditionDto(double discount, double addition) {
        this.discount = discount;
        this.addition = addition;
    }

    public double getDiscount() {
        return discount;
    }

    public double getAddition() {
        return addition;
    }
}
