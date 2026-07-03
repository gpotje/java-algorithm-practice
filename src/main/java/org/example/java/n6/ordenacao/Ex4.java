package org.example.java.n6.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex4 {
    public static void main(String[] args) {

        int[] numbers =  {-10, 50, -30, 0, 8};

        System.out.println(findSmallestIndex(numbers));
    }

    public static int findSmallestIndex(int[] numbers) {
        int smallest = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest ){
                smallest = numbers[i];
                index = i ;
            }
        }
        return index;

    }


}
