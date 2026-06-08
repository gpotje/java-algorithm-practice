package org.example.java.n2.strings;

// Exercício 4 — Verificar Palíndromo
public class Ex4 {
    public static void main(String[] args) {
        String text = "ana";
        String stringReverse = "";

        int tamanho = text.length() - 1 ;

       while (tamanho >= 0){
           stringReverse = stringReverse + text.charAt(tamanho);
           tamanho --;
       }
        System.out.println();

        if (text.equals(stringReverse)) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
    }

}
