package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex49 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        System.out.println(swapPairs(numbers));
    }

    public static List<Integer> swapPairs(List<Integer> numbers) {
        List<Integer> listNumber = new ArrayList<>();
        for(int i = 0; i <= numbers.size() -2 ; i++){
            if(numbers.size() - 1 % 2 == 0 && numbers.size() - 1 == i){

            }else{
                listNumber.add(numbers.get(i+1));
                listNumber.add(numbers.get(i));
            }
        }

        return null;
    }

//    public static int findList(List<List<String>> words,String word) {
//        for(int i = 0; i <= words.size() -1 ; i++){
//            if (words.get(i).get(0).length() == word.length()) {
//                    return i;
//            }
//
//        }
//        return  -1;
//    }

}

