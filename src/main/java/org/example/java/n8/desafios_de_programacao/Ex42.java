package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex42 {
    public static void main(String[] args) {

        List<Integer> test1 = List.of(9, 8, 7, 6);

        System.out.println(maxDifference(test1));
    }

    public static Integer maxDifference(List<Integer> numbers) {

        if(numbers.size() <= 2){
            return null;
        }

        int maxDiffernece = 0 ;
        int sum = 0;

        for(int i = 0; i <= numbers.size() - 2;i++){
         sum =  numbers.get(i) - numbers.get(i+1);
         if(sum > maxDiffernece){
                maxDiffernece = sum;
            }
        }

       return maxDiffernece;
    }}

