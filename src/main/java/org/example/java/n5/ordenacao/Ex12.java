package org.example.java.n5.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex12 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 10, 15, 21, 30, 42};

        System.out.print(middleElement(numbers, 42));

    }

    public static int middleElement(int[] numbers,int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if (target < numbers[mid]) {
                right = mid - 1;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                System.out.print("FOUND position: ");
                return mid;
            }
        }

        return -1;
    }
}
