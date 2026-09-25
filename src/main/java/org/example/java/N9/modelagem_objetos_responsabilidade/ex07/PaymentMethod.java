package org.example.java.N9.modelagem_objetos_responsabilidade.ex07;

public interface PaymentMethod {

    boolean process(double amount);

    String getReceiptMessage(double amount);
}
