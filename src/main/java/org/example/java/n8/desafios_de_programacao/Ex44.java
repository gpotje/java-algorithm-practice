package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex44 {
    public static void main(String[] args) {

        List<Integer> test1 = List.of();

        System.out.println(mostFrequent(test1));
    }

    public static Integer mostFrequent(List<Integer> numbers) {

        if(numbers.isEmpty()){
            return null;
        }

        return findNumber(numbers);
    }

    public static Integer findNumber(List<Integer> numbers){

        int mostFrequent = 0;
        int timeFrequency = 0;

        for (int i = 0; i <= numbers.size() -1; i++){
            int cont = 0;
            for (int j = 0; j <= numbers.size() -1; j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    cont ++;
                }
            }
            if(cont > timeFrequency){
                mostFrequent = numbers.get(i);
                timeFrequency = cont;
            }
        }
        return mostFrequent;
    }

}

