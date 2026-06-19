package org.example.java.n3.metodos;

// Count how many even numbers exist in an array.
public class Ex7 {
    public static void main(String[] args) {

       String text = "BCDFG";

        System.out.println(countVowels(text));

    }

    public static int countVowels(String text){
        int countVowels = 0;
        text = text.toLowerCase();
        for(int i = text.length() - 1 ; i >= 0;i--) {
            if(checkVowel(text.charAt(i))){
                countVowels ++;
            }
        }
        return countVowels;
    }

    public static boolean checkVowel(char l) {
        return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u';
    }

}
