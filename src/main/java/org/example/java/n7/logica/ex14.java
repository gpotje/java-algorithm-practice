package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex14 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "c", "python");

        ArrayList<String> listStringFinal =  removeDuplicates(words);
        System.out.print("[");
        for (String s: listStringFinal){
            System.out.print(s+",");
        }
        System.out.print("]");
    }

    public static ArrayList<String> removeDuplicates(List<String> words) {
        ArrayList<String> listString = new ArrayList<>();

        for (String word : words) {

           if(!findIndex(listString,word)){
               listString.add(word);
           }
        }
         return listString;
    }

    public static boolean findIndex(List<String> words, String word){
        for(int i = 0; i <= words.size() - 1; i++){
            if(words.get(i).equals(word)){
                return true;
            }
        }
        return false;
    }
}
