package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex2 {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 25, 42, 25};

        System.out.println(countOccurrences(numbers,25));

    }

    public static int countOccurrences(int[] numbers, int target){
        int countOccurrences = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                countOccurrences ++;
            }
        }
        return  countOccurrences ;
    }

}
