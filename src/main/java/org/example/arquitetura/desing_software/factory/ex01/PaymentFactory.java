package org.example.arquitetura.desing_software.factory.ex01;

public class PaymentFactory {
    Payment create(PayEnum type){
        if(type == PayEnum.PIX){
            return new PixPayment();
        }
        if(type == PayEnum.BOLETO){
            return new BoletoPayment();
        }
        if(type == PayEnum.CREDIT){
            return new CreditCardPayment();
        }
        throw new IllegalArgumentException("Invalid payment type: " + type);
    }
}
