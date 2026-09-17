package org.example.java.N9.modelagem_objetos_responsabilidade.ex01;

public class Ex01 {
    public static void main(String[] args) {

        Order o = new Order();

        o.addItem(new Item("hot dog",10));

        o.addItem(new Item("pizza",30));



        System.out.println(o.calculateTotal());

        o.pay();

        System.out.println(o.getStatus());



        Order o1 = new Order();

        o1.addItem(new Item("hot dog",10));

        o1.cancel();

        System.out.println(o1.getStatus());



    }
}
