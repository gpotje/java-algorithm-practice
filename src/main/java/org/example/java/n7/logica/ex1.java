package org.example.java.n7.logica;

public class ex1 {
    public static void main(String[] args) {
        String text = "aabcc";

        System.out.println(compress(text));
    }

    public static String compress(String text){

        int count = 0;
        StringBuilder compress = new StringBuilder();

        for (int i = 0;i < text.length();i++){
                if(i + 1 < text.length()  && text.charAt(i) == text.charAt(i+1)){
                    count ++ ;
                }else{
                    count ++ ;
                    compress.append(text.charAt(i));
                    compress.append(count);
                    count = 0;
                }
        }
        return compress.toString();
    }
}
