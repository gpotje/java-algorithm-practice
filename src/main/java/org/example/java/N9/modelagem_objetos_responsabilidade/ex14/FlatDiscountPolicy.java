package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

public class FlatDiscountPolicy implements DiscountPolicy{

    private double fixedAmount;


    public FlatDiscountPolicy(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double applyDiscount(double total) {
        return fixedAmount;
    }
}
