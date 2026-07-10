package org.example.java.n7.logica;

public class ex2 {
    public static void main(String[] args) {
        String text = "a1";

        System.out.println(decompress(text));
    }

    public static String decompress(String text){

        int count = 0;
        StringBuilder compress = new StringBuilder();

        for (int i = 0;i < text.length();i++){
                if(i + 1 < text.length()  &&  Character.isLetter(text.charAt(i))){
                    compress.append(text.charAt(i));
                }else{
                    char t = text.charAt(i-1);
                    int number = text.charAt(i) - '0';
                    count = 0 ;
                    while (count < number - 1) {
                        compress.append(t);
                        count ++;
                    }
                }
        }
        return compress.toString();
    }
}
