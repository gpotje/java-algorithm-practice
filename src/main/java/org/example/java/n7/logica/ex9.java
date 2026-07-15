package org.example.java.n7.logica;

public class ex9 {
    public static void main(String[] args) {
        String text = "abc";
        String pattern = "caa";

        System.out.println(containsAll(text,pattern));
    }

    public static boolean containsAll(String text, String pattern){
        char[] patternArray = pattern.toCharArray();

        for(int i = 0;i < text.length(); i++) {
            int pos = findPosition(text.charAt(i), patternArray);
            if (pos != -1) {
                patternArray[pos] = '#';
            }
        }

       return checkAllWords(patternArray);
    }

    public static int findPosition(char c, char[] chars){
        for(int j = 0;j < chars.length; j++){
            if(chars[j] == c){
                return j;
            }
        }
        return -1;
    }

    public static boolean checkAllWords(char[] pattern){
        for(int i = 0;i < pattern.length; i++){
            if(pattern[i] != '#'){
                return false;
            }
        }
        return true;
    }
}
