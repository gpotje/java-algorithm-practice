package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex48 {
    public static void main(String[] args) {
        List<String> words = List.of();;

        System.out.println(groupByLength(words));
    }

    public static List<List<String>> groupByLength(List<String> words) {
        List<List<String>> groupByLength = new ArrayList<>();

        for(int i = 0; i <= words.size() -1 ; i++){

            int index = findList(groupByLength,words.get(i));
            if(index == -1){
                List<String> n = new ArrayList<>();
                n.add(words.get(i));
                groupByLength.add(n);
            }else {
                groupByLength.get(index).add(words.get(i));
            }
        }

        return groupByLength;
    }

    public static int findList(List<List<String>> words,String word) {
        for(int i = 0; i <= words.size() -1 ; i++){
            if (words.get(i).get(0).length() == word.length()) {
                    return i;
            }

        }
        return  -1;
    }

}

