package org.example.java.n2.strings;

// Check whether two strings contain the same characters with the same frequencies.
public class Ex8 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "cd";

        if (word1.length() != word2.length()) {
            System.out.println("Anagram: false");
            return;
        }

        for (int i = 0; i < word1.length(); i++) {
            char letter = word1.charAt(i);
            int countW1 = 0;
            int countW2 = 0;

            for (int j = 0; j < word1.length(); j++) {
                if (word1.charAt(j) == letter) {
                    countW1++;
                }

                if (word2.charAt(j) == letter) {
                    countW2++;
                }
            }

            if (countW1 != countW2) {
                System.out.println("Anagram: false");
                return;
            }
        }

        System.out.println("Anagram: true");
    }
}
