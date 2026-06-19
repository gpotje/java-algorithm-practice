package org.example.java.n3.metodos;

// Count how many even numbers exist in an array.
public class Ex6 {
    public static void main(String[] args) {

       String text = "";

        System.out.println(reverse(text));

    }

    public static String reverse(String text){
        String reverseString = "";
        for(int i = text.length() - 1 ; i >= 0;i--) {
            reverseString += text.charAt(i);
        }
        return reverseString;
    }

}
