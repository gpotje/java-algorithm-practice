package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex43 {
    public static void main(String[] args) {

        List<Integer> test1 = List.of();

        System.out.println(biggestUnique(test1));
    }

    public static Integer biggestUnique(List<Integer> numbers) {

        if(numbers.isEmpty()){
            return null;
        }

        List<Integer> uniqueNumbers  = findNumber(numbers);

        if(uniqueNumbers.isEmpty()){
            return null;
        }

        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i <= uniqueNumbers.size() -1; i++){
            if(biggest < uniqueNumbers.get(i)){
                biggest = uniqueNumbers.get(i);
            }
        }
     return biggest;
    }

    public static List<Integer> findNumber(List<Integer> numbers){
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i <= numbers.size() -1; i++){
            int cont = 0;
            for (int j = 0; j <= numbers.size() -1; j++){
                if(numbers.get(i).equals(numbers.get(j)) && i != j){
                    cont ++;
                }
            }
            if(cont == 0){
                uniqueNumbers.add(numbers.get(i));
            }
        }
        return uniqueNumbers;
    }

}

