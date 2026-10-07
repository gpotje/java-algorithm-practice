package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

import java.util.List;

public class CompositeDiscountPolicy implements DiscountPolicy{
    private List<DiscountPolicy> policies;

    public CompositeDiscountPolicy(List<DiscountPolicy> policies) {
        this.policies = policies;
    }

    public void addPolicy(DiscountPolicy policy){
        policies.add(policy);
    }

    @Override
    public double applyDiscount(double total) {
        return 0;
    }
}
