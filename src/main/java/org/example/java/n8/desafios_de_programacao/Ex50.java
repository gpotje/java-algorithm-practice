package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex50 {
    public static void main(String[] args) {
        List<Integer> n1 = List.of();
        List<Integer> n2 = List.of(1, 2);

        System.out.println(intersection(n1,n2));
    }

    public static List<Integer> intersection(List<Integer> list1, List<Integer> list2){

        if(list1.isEmpty() || list2.isEmpty()){
            return new ArrayList<>();
        }
        List<Integer> listNumber = new ArrayList<>();
        for(int i = 0; i <= list1.size() -1 ; i++){
            boolean isExist = findByIndex(list1.get(i),list2);
            boolean hasList = findByIndex(list1.get(i),listNumber);
            if(isExist && !hasList){
                listNumber.add(list1.get(i));
            }
        }
        return listNumber;
    }

    private static boolean findByIndex(Integer number, List<Integer> numbers){
        for (int i = 0; i <= numbers.size() -1 ; i++) {
            if(numbers.get(i).equals(number)){
                return true;
            }
        }
        return false;
    }
}

