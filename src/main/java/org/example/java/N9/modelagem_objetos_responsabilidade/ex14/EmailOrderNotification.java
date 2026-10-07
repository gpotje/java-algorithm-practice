package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

public class EmailOrderNotification implements OrderNotification{
    @Override
    public boolean sendNotification(String customerContact, double finalPrice) {
        System.out.println("[EMAIL] Pedido no valor de R$ " + finalPrice + " enviado para " + customerContact);
        return true;
    }
}
