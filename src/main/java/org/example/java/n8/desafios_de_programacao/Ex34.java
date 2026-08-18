package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex34 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of());

        System.out.println(maxConsecutiveSum(numbers));
    }

    public static Integer maxConsecutiveSum(List<Integer> numbers) {

        if(numbers.size() < 2 ){
            return null;
        }
        int biggestSum = Integer.MIN_VALUE ;

        for(int i = 0; i <= numbers.size() - 2; i++  ){
            int currentSum = numbers.get(i) + numbers.get(i+1);
          if( biggestSum < currentSum ){
              biggestSum = currentSum;
          }
        }

        return biggestSum;
    }
}