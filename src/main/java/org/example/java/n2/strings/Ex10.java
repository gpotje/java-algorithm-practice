package org.example.java.n2.strings;

// Count how many times a word appears in a text.
public class Ex10 {
    public static void main(String[] args) {
        //String text = "spring java docker";
        //String text = "java backend java spring java";
        //String text = "spring java docker";
        //String text = "spring docker";
        String text = "";
        String word = "java";
        String newText = "";
        int countSameWord = 0 ;
        int i = 0;

        while(i < text.length()){
            char l  = text.charAt(i);
            boolean checkChar = Character.isSpaceChar(l);

            if(!checkChar){
                newText += l;
            }else {
                if(newText.equals(word)){
                    countSameWord ++;
                }
                newText = "";
            }
            i++;
        }
        if(newText.equals(word)){
            countSameWord ++;
        }

        System.out.println("Occurrences: "+countSameWord);

    }
}
