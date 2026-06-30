package org.example.java.n5.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex9 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 10, 15, 21, 30, 42};

        System.out.println(middleElement(numbers));

    }

    public static int middleElement(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;

        int mid = (left + right) / 2;

        return  numbers[mid];
    }

}
