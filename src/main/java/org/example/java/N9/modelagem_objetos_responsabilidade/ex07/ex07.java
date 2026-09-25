package org.example.java.N9.modelagem_objetos_responsabilidade.ex07;

public class ex07 {
    public static void main(String[] args) {
        PaymentMethod pp =  new PixPayment("45454545");
        PaymentMethod cp =  new CreditCardPayment("8888888");

        PaymentProcessor cpp =  new PaymentProcessor();
        System.out.println(cpp.checkout(pp,1000.0));

        System.out.println(cpp.checkout(cp,1000.0));


    }
}
