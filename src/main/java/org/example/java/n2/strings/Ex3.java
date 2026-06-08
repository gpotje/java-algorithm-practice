package org.example.java.n2.strings;

// Exercício 3 — Inverter uma String
public class Ex3 {
    public static void main(String[] args) {
        //String text = "Gabriel"; // test 1
        String text = "";
        int tamanho = text.length() - 1 ;

       while (tamanho >= 0){
           System.out.print(text.charAt(tamanho));
           tamanho --;
       }
    }

}
