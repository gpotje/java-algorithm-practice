package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex3 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 3, 8, 10};

        System.out.println(firstIndexOf(numbers,8));

    }

    public static int firstIndexOf(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                return i;
            }
        }
        return  -1 ;
    }

}
