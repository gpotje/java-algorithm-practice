package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex28 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(8));

        System.out.println(firstUnique(numbers));
    }

    public static Integer firstUnique(ArrayList<Integer> numbers){
        for(int i = 0;i <= numbers.size() -1 ; i++){
            if(findNumber(i,numbers)){
                return numbers.get(i);
            }
        }
        return  null;
    }
    public static boolean findNumber(int index , ArrayList<Integer> numbers) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
          if(numbers.get(index).equals(numbers.get(i)) && i != index){
                    return false;
          }
        }
        return true;
        }
    }
