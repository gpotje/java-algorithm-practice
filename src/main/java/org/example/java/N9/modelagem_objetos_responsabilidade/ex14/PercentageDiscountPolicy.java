package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

public class PercentageDiscountPolicy implements DiscountPolicy{

    private double discountPercentage;

    public PercentageDiscountPolicy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double total) {
        return total * discountPercentage;
    }
}
