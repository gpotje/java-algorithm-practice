package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex14 {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 10, 1, 5};

        System.out.println(range(numbers));

    }

    public static int range(int[] numbers) {

        int largest  = numbers[0];
        int smallest  = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest ) {
                largest  = numbers[i];
            }
            if (numbers[i] < smallest ) {
                smallest  = numbers[i];
            }
        }

        return largest - smallest;
    }
}
