package org.example.java.N9.modelagem_objetos_responsabilidade.ex05;

public class ex05 {
    public static void main(String[] args) {
        Account a1 = new Account("0002XX",1000.0);
        Account a2 = new Account("XXX300",1000.0);

        System.out.println(a1.getBalance());

   //     a1.deposit(1000.0);

   //     System.out.println("deposit + 1000.0  = "+a1.getBalance());

//        a1.withdraw(1000.0);
//
//        System.out.println("withdraw - 1000.0  = "+a1.getBalance());

        a1.transferTo(a2,1000.0);

        System.out.println("FINAL A1 = "+a1.getBalance());
        System.out.println("FINAL A2 = "+a2.getBalance());

    }
}
