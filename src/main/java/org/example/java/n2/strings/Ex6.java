package org.example.java.n2.strings;

// Count the number of words in a string without using split().
public class Ex6 {
    public static void main(String[] args) {
        String text = "";
        int index = text.length() - 1;
        int countLetterJ = 0;
        int countLetterMain = 0;
        char BiggestChar = ' ';

        if(text.isEmpty()){
            System.out.println("String cannot be empty");
            return;
        }

        for(int i = 0; i <= index; i++){
           for (int j = 0; j <= index; j++){
              if(text.charAt(i) == text.charAt(j) ){
                   countLetterJ ++;
                  }
               }
           if(countLetterJ > countLetterMain){
               countLetterMain = countLetterJ;
               BiggestChar = text.charAt(i);
           }
           countLetterJ = 0;
        }

        System.out.println("Most frequent character: "+BiggestChar);
        System.out.println("Frequency: "+countLetterMain);


    }

}
