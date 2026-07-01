package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex11 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 10, 15, 21, 30, 42};

        middleElement(numbers, 7);

    }

    public static void middleElement(int[] numbers,int target) {
        int left = 0;
        int right = numbers.length - 1;

        int mid = (left + right) / 2;

        if (target < numbers[mid]) {
            right = mid - 1;
        } else if (target > numbers[mid]) {
            left = mid + 1;
        } else {
            System.out.println("FOUND");
        }

        System.out.println("Left: " + left);
        System.out.println("Right: " + right);

    }
}
