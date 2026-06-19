package org.example.java.n3.metodos;

// Count how many even numbers exist in an array.
public class Ex5 {
    public static void main(String[] args) {

        int[] numbers = {} ;

        System.out.println(countEvenNumbers(numbers));

    }

    public static int countEvenNumbers(int[] numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int countEvenNumbers = 0;
        for(int i = 0; i < numbers.length;i++) {
            if(numbers[i] % 2 == 0){
                countEvenNumbers ++;
            }
        }
        return countEvenNumbers;
    }

}
