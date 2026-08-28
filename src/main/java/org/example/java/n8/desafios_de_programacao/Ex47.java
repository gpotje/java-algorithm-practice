package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex47 {
    public static void main(String[] args) {
        List<List<Integer>> grades = List.of();
        System.out.println(biggestFromEach(grades));
    }

    public static List<Integer> biggestFromEach(List<List<Integer>> numbers) {
        List<Integer> numberFinal = new ArrayList<>();

        for(int i = 0; i <= numbers.size() -1 ; i++){
            int biggest = Integer.MIN_VALUE;
            for(int j = 0; j <= numbers.get(i).size() - 1 ; j++) {
                if(biggest < numbers.get(i).get(j)){
                    biggest = numbers.get(i).get(j);
                }
            }
            numberFinal.add(biggest);
        }
        return numberFinal;
    }

}

