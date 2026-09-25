package org.example.java.N9.modelagem_objetos_responsabilidade.ex13;

public class StateTax implements TaxStrategy{
    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
