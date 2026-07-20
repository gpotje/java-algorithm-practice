package org.example.java.n7.logica;

public class ex11 {
    public static void main(String[] args) {
        String text = "chat";

        System.out.println(longestWord(text));
    }

    public static  String longestWord(String text){
        if (text.isEmpty()) {
            return "";
        }
        int size = text.length();
        StringBuilder stringFinal =  new StringBuilder();
        StringBuilder stringTemp =  new StringBuilder();

        for(int i = 0;i <= size - 1; i++) {
            if (!isSpace(text.charAt(i))){
                stringTemp.append(text.charAt(i));

            }else if(stringFinal.length() < stringTemp.length()){
                clean(stringFinal);
                stringFinal.append(stringTemp);
                clean(stringTemp);
            }
            else{clean(stringTemp);}
        }

        if(stringFinal.length() < stringTemp.length()){
            clean(stringFinal);
            stringFinal.append(stringTemp);
            clean(stringTemp);
        }

       return stringFinal.toString();
    }

    public static boolean isSpace(char l){
        return l == ' ';
    }
    public static void clean(StringBuilder stringBuilder){
        stringBuilder.setLength(0);
    }

}
