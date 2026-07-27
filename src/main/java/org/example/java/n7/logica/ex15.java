package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex15 {
    public static void main(String[] args) {
        List<String> words = List.of("");
        System.out.println(mostFrequent(words));
    }

    public static String mostFrequent(List<String> words) {

        if(words.isEmpty()){
            return "";
        }

        int mostFrequent = 0;
        String StringFinal = "";

        for(String word : words){
            int occurrences = countOccurrences(words,word);
            if(occurrences > mostFrequent){
                mostFrequent = occurrences;
                StringFinal = word;
            }
        }
        return StringFinal;
    }

    public static int countOccurrences(List<String> words, String word){
        int count = 0;
        for(int i = 0; i <= words.size() - 1; i++){
            if(words.get(i).equals(word)){
                count ++;
            }
        }
        return count;
    }
}
