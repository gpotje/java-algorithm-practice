package org.example.java.n2.strings;

// Count the number of words in a string without using split().
public class Ex5 {
    public static void main(String[] args) {
        //String text = "Java   Backend    Developer"; test
        String text = " Java Backend ";
        int index = 0;
        int countWords = 0;

       while (index <= text.length() - 1){
           char l = text.charAt(index);
           boolean isLetter = Character.isLetterOrDigit(l);
           boolean validIndex = index - 1 >= 0;

           if(index == 0 && isLetter){
               countWords ++;
           }

           if(validIndex){
               if(Character.isSpaceChar(text.charAt(index -1) )&& isLetter){
                   countWords ++;
               }
           }
           index ++;

       }

        System.out.println("Words: "+countWords);

    }

}
