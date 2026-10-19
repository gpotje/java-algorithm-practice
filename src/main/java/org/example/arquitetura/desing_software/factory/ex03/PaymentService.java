package org.example.arquitetura.desing_software.factory.ex03;

public class PaymentService {
    public void process(PayEnum type, double amount) {
        PaymentFactory factory = new PaymentFactory();
        Payment payment = factory.create(type);
        payment.process(amount);
    }
}
