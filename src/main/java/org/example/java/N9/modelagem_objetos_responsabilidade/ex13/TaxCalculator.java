package org.example.java.N9.modelagem_objetos_responsabilidade.ex13;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {
    private List<TaxStrategy> strategies;

    public TaxCalculator() {
        this.strategies = new ArrayList<>();
    }

    public void addStrategy(TaxStrategy strategy){
        strategies.add(strategy);
    }

    public double calculateTotalTax(double amount){
        double sum = 0.0;
        for (TaxStrategy ts:strategies){
            sum = sum + ts.calculate(amount);
        }
        return sum;
    }

}
