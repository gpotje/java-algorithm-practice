package org.example.java.n2.strings;

// Exercise 1: Count Consonants in a string.
public class Ex2 {
    public static void main(String[] args) {
        String text = "Java Backend 123 !";
        //String text = "BCDFG";
        //String text = "AEIOU";
        String textLowerCase = text.toLowerCase();
        int countConsonants = 0;

        for (int i = 0; i < textLowerCase.length(); i++) {
            if (checkConsonants(textLowerCase.charAt(i))) {
                countConsonants++;
            }
        }

        System.out.println("Consonants: " + countConsonants);

    }

    public static boolean checkConsonants(char l) {
        return l != 'a' && l != 'e' && l != 'i' && l != 'o' && l != 'u'  && Character.isLetter(l);
    }


}
