package org.example.java.N9.modelagem_objetos_responsabilidade.ex07;

public class PixPayment implements PaymentMethod {

    private String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
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
        return "Pago R$ "+amount+" via Pix para a chave " + pixKey;
    }
}
