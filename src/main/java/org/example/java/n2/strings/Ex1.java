package org.example.java.n2.strings;

// Exercise 1: Count vowels in a string.
public class Ex1 {
    public static void main(String[] args) {
        //String text = "Java Backend";
        //String text = "Gabriel";
        // String text = "";
        //String text = "JAVA BACKEND";
        String text = "aeiouAEIOU";
        String textLowerCase = text.toLowerCase();
        int countVowel = 0;

        for (int i = 0; i < textLowerCase.length(); i++) {
            if (checkVowel(textLowerCase.charAt(i))) {
                countVowel++;
            }
        }

        System.out.println("Vowels: " + countVowel);

    }

    public static boolean checkVowel(char l) {
       return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u';
    }


}
