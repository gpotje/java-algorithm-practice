package org.example.java.n2.strings;

// Find the most frequent word in a string.
public class Ex15 {
    public static void main(String[] args) {
        String text = "java spring java docker java";

        String mostFrequentWord = "";
        int maxFrequency = 0;

        String currentWord = "";

        for (int i = 0; i <= text.length(); i++) {

            if (i < text.length() && text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else {

                int frequency = 0;
                String checkWord = "";

                for (int j = 0; j <= text.length(); j++) {

                    if (j < text.length() && text.charAt(j) != ' ') {
                        checkWord += text.charAt(j);
                    } else {

                        if (checkWord.equals(currentWord)) {
                            frequency++;
                        }

                        checkWord = "";
                    }
                }

                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostFrequentWord = currentWord;
                }

                currentWord = "";
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxFrequency);
    }

}



