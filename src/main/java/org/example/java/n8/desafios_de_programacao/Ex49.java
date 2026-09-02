package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex49 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of();

        System.out.println(swapPairs(numbers));
    }

    public static List<Integer> swapPairs(List<Integer> numbers) {
        List<Integer> listNumber = new ArrayList<>();
        for(int i = 1; i <= numbers.size() -1 ; i+=2){
                listNumber.add(numbers.get(i));
                listNumber.add(numbers.get(i-1));
        }
        if(numbers.size() % 2 != 0){
            listNumber.add(numbers.get(numbers.size()-1));
        }
        return listNumber;
    }

}

