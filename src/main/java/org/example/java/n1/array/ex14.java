package org.example.java.n1.array;
/*
* Você acabou de resolver um problema que é a base conceitual de um HashMap<Integer, Integer>.
* */

public class ex14 {
    public static void main(String[] args) {

        //int numbers[] = {1, 2, 2, 3, 1, 2, 4}; // test 1°
        //int numbers[] =  {5, 5, 5, 5} ;// test 2°
          int numbers[] =  {1, 2, 3, 4} ;// test 3°

        int count = 0;
        int number = 0;
        int frequency = 0;

        if(numbers.length == 0){
            System.out.println("Array cannot be empty");
            return;
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if(count > frequency){
                frequency = count;
                number = numbers[i];
            }
            count = 0;
        }
        System.out.println("Most frequent number: "+number);
        System.out.println("Frequency: "+frequency);
    }
}
