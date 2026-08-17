package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex31 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(7, 7, 7, 1, 7));

        System.out.println(longestSequence(numbers));
    }

    public static int longestSequence(List<Integer> numbers) {

        if(numbers.isEmpty()){
            return 0;
        }
        if(numbers.size() == 1){
            return 1;
        }

        int count = 1;
        int biggest = 1;

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                count++;
            } else {
                if (count > biggest) {
                    biggest = count;
                }
                count = 1;
            }
        }

        if (count > biggest) {
            biggest = count;
        }

        return biggest;
    }



}