package org.example.java.n6.ordenacao;


public class Ex6 {
    public static void main(String[] args) {

        int[] numbers =  {5, 2, 9, 1, 7};

        System.out.println(findSmallestIndex(numbers,4));
    }

    public static int findSmallestIndex(int[] numbers, int start) {
        int smallest = numbers[start];
        int index = start;


        for (int i = start; i < numbers.length; i++) {
            if(numbers[i] < smallest ){
                smallest = numbers[i];
                index = i ;
            }
        }

        return index;
    }


}
