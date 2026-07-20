package org.example.java.n7.logica;

public class ex10 {
    public static void main(String[] args) {
        String text = "abc";

        System.out.println(compress(text));
    }

    public static  String compress(String text){
        if (text.isEmpty()) {
            return "";
        }

        int count = 0;
        int size = text.length();
        StringBuilder stringFinal =  new StringBuilder();

        for(int i = 0;i <= size - 1; i++) {
            if (i + 1 < size && text.charAt(i) == text.charAt(i+1)){
                count ++;
            }else{
                count ++;
                stringFinal.append(text.charAt(i)).append(count);
                count = 0;
            }
        }
       return stringFinal.toString();
    }
}
