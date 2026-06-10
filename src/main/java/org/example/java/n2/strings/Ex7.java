package org.example.java.n2.strings;

// Find the first character that appears only once in a string.
public class Ex7 {
    public static void main(String[] args) {
        //String text = "swiss";
        //String text = "banana";
        //String text = "aabbcc";
        //String text = "a";
        String text = "";
        int index = text.length() - 1;
        int countLetter = 0;

        if(text.isEmpty()){
            System.out.println("String cannot be empty");
            return;
        }

        for(int i = 0; i <= index; i++){
           for (int j = 0; j <= index; j++){
              if(text.charAt(i) == text.charAt(j) ){
                  countLetter++;
                  }
               }
           if(countLetter == 1){
               System.out.println("First non-repeated character: "+text.charAt(i));
               return;
           }
            countLetter = 0;
        }
        System.out.println("No non-repeated character found");
    }

}
