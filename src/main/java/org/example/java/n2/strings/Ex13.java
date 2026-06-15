package org.example.java.n2.strings;

// Check whether all characters in a string are unique.
public class Ex13 {
    public static void main(String[] args) {
        //String text = "";
        String text = "java";

        int index = text.length()-1;

        for(int i = 0; i <= index ;i++){
            for(int j = i + 1; j <= index; j++){
                char ai = text.charAt(i);
                char ij =  text.charAt(j);
                if(text.charAt(i) == text.charAt(j) && i != j){
                    System.out.println("All characters are unique: false");
                    return;
                }
            }
        }
        System.out.println("All characters are unique: true");
    }

}

