package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex14 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "python", "java","c","python");

        printList(groupByLength(words));

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        List<List<String>> listString = new ArrayList<>();
        for (String word : words) {
             int index = findIndex(listString,word);
             if( index == -1){
                    ArrayList<String> nl = new ArrayList<>();
                    nl.add(word);
                    listString.add(nl);
             }else{
                    listString.get(index).add(word);
             }

        }
         return listString;
    }

    public static int findIndex(List<List<String>> words, String word){
        for(int i = 0; i <= words.size() - 1; i++){
           if(words.get(i).getFirst().length() == word.length() ){
                return i;
           }
        }
        return -1;
    }

    public static void printList(List<List<String>> words){
        System.out.print("[");
        for(List<String> words1 : words ){
            System.out.print("{");
            for (int i = 0; i < words1.size(); i++) {
                System.out.print(words1.get(i));
                if (i < words1.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");
        }
        System.out.print("]");
    }

}
