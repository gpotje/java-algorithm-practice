package org.example.java.N9.modelagem_objetos_responsabilidade.ex07;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean process(double amount) {
        if(amount > 2 ){
            return true;
        }
        return false;
    }

    @Override
    public String getReceiptMessage(double amount) {
        return "Pago R$ "+amount+" no Cartão final " + cardNumber;
    }
}
