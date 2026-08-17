package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex32 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5, Integer.MIN_VALUE));

        System.out.println(longestSequence(numbers));
    }

    public static Integer longestSequence(List<Integer> numbers) {

        if(numbers.isEmpty() || numbers.size() == 1){
            return null;
        }
        int biggest = Integer.MIN_VALUE ;
        int secondBiggest = Integer.MIN_VALUE ;

        for(int i = 0; i <= numbers.size() - 1; i++  ){
            if(numbers.get(i) > biggest){
                secondBiggest = biggest;
                biggest = numbers.get(i);
            }
            if(numbers.get(i) > secondBiggest && numbers.get(i) <  biggest && i != 0 ){
                secondBiggest = numbers.get(i);
            }
        }

        return secondBiggest == Integer.MIN_VALUE ? null : secondBiggest;
    }
}