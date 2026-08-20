package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex37 {
    public static void main(String[] args) {
        List<Integer> numbersOne = List.of(1, 2);
        List<Integer> numbersSecond = List.of(10, 20, 30, 40);

        System.out.println(interleave(numbersOne,numbersSecond));
    }

    public static List<Integer> interleave(List<Integer> numbers1, List<Integer> numbers2) {

        if(numbers1.isEmpty() && numbers2.isEmpty() ){
            return new ArrayList<>();
        }
        if(numbers1.isEmpty() ){
            return new ArrayList<>(numbers2);
        }
        if(numbers2.isEmpty() ){
            return new ArrayList<>(numbers1);
        }

        List<Integer> integerList = new ArrayList<>();
        int sizeListB = 0;

        for(int i = 0; i <= numbers1.size() - 1; i++  ){
            if(sizeListB <= numbers2.size() - 1){
                integerList.add(numbers1.get(i));
                integerList.add(numbers2.get(sizeListB));
                sizeListB++;
            }else {
                integerList.add(numbers1.get(i));
            }
        }
        while (sizeListB <= numbers2.size() - 1){
            integerList.add(numbers2.get(sizeListB));
            sizeListB++;
        }

        return integerList;
    }
}