package org.example.java.n2.strings;

// Check whether two strings contain the same characters with the same frequencies.
public class Ex9 {
    public static void main(String[] args) {
        //String text = "Java    Backend     Developer";
        //String text = "  Gabriel   Silva  ";
        String text = "     ";
        String newText = "";


        int index = text.length()-1;

        for(int i = 0; i <= index; i++){
            if(i == 0){
                newText += text.charAt(i);
            }
            if(i - 1 >= 0 ){
                if(Character.isSpaceChar(text.charAt(i)) && Character.isSpaceChar(text.charAt(i-1))){

                }else {
                    newText += text.charAt(i);
                }
            }

        }
        System.out.println(newText);

    }
}
