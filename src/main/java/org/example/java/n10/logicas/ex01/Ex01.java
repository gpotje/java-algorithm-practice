package org.example.java.n10.logicas.ex01;

public class Ex01 {
    public static void main(String[] args) {

        String w1 = "Java";
        String w2 = "Python";

        System.out.println(isAnagram(w1,w2));
    }

    public static boolean isAnagram(String text1, String text2){

        String text1Low = text1.toLowerCase();
        String text2Low = text2.toLowerCase();

        if(text1Low.length() != text2Low.length() ){
            return false;
        }

        char[] arrayCaracteres = text1Low.toCharArray();

        for (int i = 0; i <= text2Low.length() -1; i++ ){
            boolean teste = findSameWord(arrayCaracteres[i],text2Low);
            if(teste){
                arrayCaracteres[i] = '*';
            }
        }
        for (int i = 0; i <= arrayCaracteres.length -1; i++ ){
            if(arrayCaracteres[i] != '*'){
                return false;
            }
        }
       return true;
    }
    public static boolean findSameWord(char c1, String t2){
        for (int i = 0; i <= t2.length() -1; i++ ){
            if(c1 == t2.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
