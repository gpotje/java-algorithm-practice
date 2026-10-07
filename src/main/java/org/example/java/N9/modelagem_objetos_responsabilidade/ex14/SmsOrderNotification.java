package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

public class SmsOrderNotification implements OrderNotification{
    @Override
    public boolean sendNotification(String customerContact, double finalPrice) {
        System.out.println("[SMS] Pedido no valor de R$ " + finalPrice + " enviado para " + customerContact);
        return true;
    }
}
