package org.example.java.N9.modelagem_objetos_responsabilidade.ex69;

public class DeliveryService {

    private ShippingCalculator shippingCalculator;

    public DeliveryService(ShippingCalculator shippingCalculator) {
        this.shippingCalculator = shippingCalculator;
    }

    public double processDelivery(double weight, double distance){
        double valorCalculado = shippingCalculator.calculateShipping(weight,distance);
        System.out.println("Frete calculado: R$ " + valorCalculado);
        return valorCalculado;
    }
}
