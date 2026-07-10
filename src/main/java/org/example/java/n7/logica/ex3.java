package org.example.java.n7.logica;

import org.example.java.n6.ordenacao.Util;

public class ex3 {
    public static void main(String[] args) {
        String t1 = "";
        String t2 = "";

        System.out.println(isAnagram(t1,t2));
    }

    public static boolean isAnagram(String t1, String t2){

        if(t1.length() != t2.length()){
            return false;
        }

        int size = t1.length() - 1;
        char[] teste = t2.toCharArray();

        for(int i = 0; i <= size; i++){
            boolean exist = false;
            for(int j = size; j >= 0 ; j--){
                if(t1.charAt(i) == teste[j] ){
                    teste[j] = '#';
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                return false;
            }
        }
        return true;
    }
}
