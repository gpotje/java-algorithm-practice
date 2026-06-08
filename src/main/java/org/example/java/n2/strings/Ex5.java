package org.example.java.n2.strings;

// Count the number of words in a string without using split().
public class Ex5 {
    public static void main(String[] args) {
        //String text = " ";
        String text = "Java   Backend    Developer";

        int tamanho = 0;
        int countWords = 0;

       while (tamanho <= text.length() - 1){
            char word = text.charAt(tamanho);
            boolean isLetterOrDigit = Character.isLetterOrDigit(text.charAt(tamanho));

            boolean isSpaceCharAfter = false;
            boolean isSpaceCharBefore = false;

            if(tamanho + 1 <= text.length()){
                isSpaceCharAfter = Character.isSpaceChar(text.charAt(tamanho+1));
            }

           if(tamanho - 1 >= 0){
               isSpaceCharBefore = Character.isSpaceChar(text.charAt(tamanho-1));
           }


           if(isLetterOrDigit &&  isSpaceCharAfter){
               countWords ++;
               System.out.println(text.charAt(tamanho)+"- After - ");
           }
           if(isLetterOrDigit &&  isSpaceCharBefore){
               countWords ++;
               System.out.println(text.charAt(tamanho)+"- Before - ");
           }

           tamanho ++;
       }

        System.out.println("Words: "+countWords);

    }

}
