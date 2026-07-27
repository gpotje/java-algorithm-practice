package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex16 {
    public static void main(String[] args) {
        List<String> words = List.of("amor", "roma", "java", "carro", "avaj", "casa");
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
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
            if(isAnagram(words.get(i).getFirst(),word) ){
                return i;
            }
        }
        return -1;
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
