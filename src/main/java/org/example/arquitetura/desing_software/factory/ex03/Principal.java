package org.example.arquitetura.desing_software.factory.ex03;

public class Principal {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.process(PayEnum.PIX,1000.0);
    }
}
