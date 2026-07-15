package org.example.java.n7.logica;

public class ex8 {
    public static void main(String[] args) {
        String t1 = "";

        System.out.println(removeDuplicates(t1));
    }

    public static String removeDuplicates(String text){
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < text.length(); i++){
             if(!isPresent(text.charAt(i),sb)){
                sb.append(text.charAt(i));
            }
        }
       return sb.toString();
    }

    public static boolean isPresent (char c, StringBuilder sb){
        for(int j = 0;j < sb.length(); j++){
            if(sb.charAt(j) == c){
                return true;
            }
        }
        return false;
    }
}
