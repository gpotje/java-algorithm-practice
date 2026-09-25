package org.example.java.N9.modelagem_objetos_responsabilidade.ex07;

public class PaymentProcessor {
    public String checkout(PaymentMethod method, double amount){
        if(method.process(amount)){
            return method.getReceiptMessage(amount);
        }
        return "Erro";
    }

}
