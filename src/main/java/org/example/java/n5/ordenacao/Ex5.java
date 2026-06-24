package org.example.java.n5.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex5 {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 99, 42};

        System.out.println(contains(numbers,100));

    }

    public static boolean contains(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                return true;
            }
        }
        return  false;
    }

}
