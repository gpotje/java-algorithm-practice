package org.example.java.n7.logica;

public class ex12 {
    public static void main(String[] args) {
        String text = "aab";

        String finalWord = longestUniqueSequence(text);
        int count = finalWord.length();

        System.out.println("The biggest sequence is: "+finalWord+" contains: "+count);
    }

    public static String longestUniqueSequence(String text){
        if(text.isEmpty()){
            return "";
        }
        int size = text.length();
        StringBuilder stringComparison = new StringBuilder();
        StringBuilder stringFinal =  new StringBuilder();

        for(int i = 0;i <= size - 1; i++) {
            if(!isPresent(text.charAt(i),stringComparison)){
                stringComparison.append(text.charAt(i));
            }else{
               if(stringFinal.length() < stringComparison.length()){
                   clean(stringFinal);
                   stringFinal.append(stringComparison);
                   clean(stringComparison);
                   stringComparison.append(text.charAt(i));
               }
            }
        }
       return stringFinal.length() < 2 ? stringComparison.toString() : stringFinal.toString();
    }

    public static boolean isPresent (char c, StringBuilder sb){
        for(int j = 0;j < sb.length(); j++){
            if(sb.charAt(j) == c){
                return true;
            }
        }
        return false;
    }

    public static void clean(StringBuilder stringBuilder){
        stringBuilder.setLength(0);
    }

}
