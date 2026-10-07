package org.example.java.N9.modelagem_objetos_responsabilidade.ex69;

public class ExpressShipping implements ShippingCalculator{
    @Override
    public double calculateShipping(double weight, double distance) {
        return (weight * 3.00) + (distance * 1.20) + 15;
    }
}
