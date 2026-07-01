package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex4 {
    public static void main(String[] args) {

        int[] numbers = {10};

        System.out.println(lastIndexOf(numbers,9));

    }

    public static int lastIndexOf(int[] numbers, int target){
        int index = - 1 ;
        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i] && i > index){
               index = i ;
            }
        }
        return  index ;
    }

}
