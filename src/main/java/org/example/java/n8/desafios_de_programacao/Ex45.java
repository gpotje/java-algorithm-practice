package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex45 {
    public static void main(String[] args) {

        List<Integer> test1 = List.of();

        System.out.println(removeDuplicates(test1));
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {

        if(numbers.isEmpty()){
            return new ArrayList<>();
        }

        List<Integer> numbersFinal =  new ArrayList<>();

        for (int j = 0; j <= numbers.size() -1; j++){
            if(findUniqueNumber(numbersFinal,numbers.get(j))){
                numbersFinal.add(numbers.get(j));
            }
        }
        return numbersFinal;
    }

    public static boolean findUniqueNumber(List<Integer> numbers,int number){

        for (int j = 0; j <= numbers.size() -1; j++){
            if(numbers.get(j).equals(number)){
                return false;
            }
        }
        return true;
    }

}

