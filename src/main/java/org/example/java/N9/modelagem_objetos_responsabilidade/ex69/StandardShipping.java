package org.example.java.N9.modelagem_objetos_responsabilidade.ex69;

public class StandardShipping implements ShippingCalculator{
    @Override
    public double calculateShipping(double weight, double distance) {
        return (weight * 1.50) + (distance * 0.50);
    }
}
