package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex13 {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 10, 1, 5};

        System.out.println(findSmallest(numbers));

    }

    public static int findSmallest(int[] numbers) {

        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }
}
