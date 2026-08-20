package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex36 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(9, 8, 7, 6, 9));

        System.out.println(firstRepeated(numbers));
    }

    public static Integer firstRepeated(List<Integer> numbers) {

        if(numbers.isEmpty() ){
            return null;
        }

        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i <= numbers.size() - 1; i++  ){

          if( findNumber(integerList,numbers.get(i))){
              return numbers.get(i);
          }
            integerList.add(numbers.get(i));
        }

        return null;
    }

    public static boolean findNumber(List<Integer> numbers, int number) {

        for (int i = 0; i <= numbers.size() -1 ; i++) {
            if(numbers.get(i).equals(number)){
                return true;
            }
        }
        return false;
    }

}