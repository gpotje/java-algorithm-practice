package org.example.java.n2.strings;

// Remove duplicate characters, keeping only the first occurrence.
public class Ex14 {
    public static void main(String[] args) {
        String text = "banana";
        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            boolean exists = false;

            for (int j = 0; j < result.length(); j++) {

                if (current == result.charAt(j)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result += current;
            }
        }

        System.out.println(result);
    }

    }



