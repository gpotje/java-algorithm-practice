package org.example.java.n2.strings;

// Check whether a string is a palindrome using two pointers.
public class Ex12 {
    public static void main(String[] args) {
        String text = "java";

        int index = text.length()-1;

        for(int i = 0; i <= text.length()-1; i++){
            char ia = text.charAt(i);
            char ie = text.charAt(index);
            if(text.charAt(i)!=text.charAt(index)){
                System.out.println("Palindrome: false");
                return;
            }
            index--;
        }
        System.out.println("Palindrome: true");
    }

}

