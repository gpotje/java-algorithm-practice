package org.example.java.n5.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex6 {
    public static void main(String[] args) {

        int[] numbers = {99, 10, 5};

        System.out.println(secondLargest(numbers));

    }

    public static int secondLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }


        }
        return  secondLargest;
    }

}
