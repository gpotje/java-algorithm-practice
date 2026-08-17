package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex30 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 1, 2, 3));

        System.out.println(removeConsecutiveDuplicates(numbers));
    }

    public static List<Integer> removeConsecutiveDuplicates(List<Integer> numbers) {

        if(numbers.isEmpty()){
            return new ArrayList<>();
        }

        List<Integer> listFinal = new ArrayList<>();
        listFinal.add(numbers.get(0));
        int count = 0;

        for (int i = 0 ; i <= numbers.size() - 1; i++) {
            if(!comparesNumbers(numbers.get(i),listFinal.get(count))){
                listFinal.add(numbers.get(i));
                count++;
            }
        }

        return listFinal;
    }

    private static boolean comparesNumbers(int listNumber,int listFinal ){
        if(listNumber == listFinal){
                return true;
        }
        return false;
    }

}