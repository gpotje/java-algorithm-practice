package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 25, 42, 25};

        System.out.println(linearSearch(numbers,25));

    }

    public static int linearSearch(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                return i;
            }
        }
        return  -1 ;
    }

}
