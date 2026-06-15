package org.example.java.n2.strings;

// Remove duplicate characters, keeping only the first occurrence.
public class Ex14 {
    public static void main(String[] args) {
        //String text = "";
        String text = "java";
        String newString = "";

        int index = text.length()-1;

        for(int i = 0; i <= index ;i++){
            for(int j = i + 1; j <= index; j++){
                char ai = text.charAt(i);
                char ij =  text.charAt(j);
                if(text.charAt(i) != text.charAt(j) ){

                }
            }
        }
        System.out.println("All characters are unique: true");
    }

}

