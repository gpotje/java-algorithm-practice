package org.example.java.N9.modelagem_objetos_responsabilidade.ex03;

public class ex03 {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("teste1", 1.0, 1);
        CartItem c2 = new CartItem("teste2", 1.0, 1);
        CartItem c3 = new CartItem("teste3", 1.0, 1);
        CartItem c4 = new CartItem("teste4", 1.0, 1);
        CartItem c5 = new CartItem("teste5", 1.0, 1);
        CartItem c6 = new CartItem("teste5", 1.0, 1);
        CartItem c7 = new CartItem("teste5", 1.0, 1);
        CartItem c8 = new CartItem("teste5", 1.0, 1);
        CartItem c9 = new CartItem("teste5", 1.0, 1);
        CartItem c10 = new CartItem("teste5", 1.0, 1);


        ShoppingCart sc = new ShoppingCart();

        sc.addItem(c1);
        sc.addItem(c2);
        sc.addItem(c3);
        sc.addItem(c4);
        sc.addItem(c5);
        System.out.println(sc.calculateTotal());
        System.out.println();

        sc.addItem(c6);
        sc.addItem(c7);
        sc.addItem(c8);
        sc.addItem(c9);
        sc.addItem(c10);

        System.out.println(sc.calculateTotal());

    }
}
