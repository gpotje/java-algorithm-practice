package org.example.java.n2.strings;

// Find the longest word in a string.
public class Ex11 {
    public static void main(String[] args) {
        //String text = "Java Backend Developer";
        //String text = "Spring Boot";
        //String text = "Java";
        //String text = "";
        String text = "A BBB CC";
        String newText = "";
        String firstWord = "";
        int i = 0;


        int index = text.length() - 1;

        if(text.isEmpty()){
            System.out.println("String cannot be empty");
            return;
        }

        while(i <= index){
                while(!Character.isSpaceChar(text.charAt(i)) && i < index) {
                        firstWord += text.charAt(i);
                        i++;
                }
                if(i == index){
                    firstWord += text.charAt(i);
                }
                if(firstWord.length() > newText.length()) {
                    newText = firstWord;

                }
            firstWord = "";
            i++;
        }

        System.out.println("Longest word: "+newText);
    }

}

