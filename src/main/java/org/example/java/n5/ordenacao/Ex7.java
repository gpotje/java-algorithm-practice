package org.example.java.n5.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex7 {
    public static void main(String[] args) {

        int[] numbers = {-5, -2, 0, 3}      ;

        System.out.println(isSorted(numbers));

    }

    public static boolean isSorted(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(i + 1 < numbers.length){
                if (numbers[i] > numbers[i+1]) {
                    return  false;
                }
            }
        }

        return  true;
    }

}
