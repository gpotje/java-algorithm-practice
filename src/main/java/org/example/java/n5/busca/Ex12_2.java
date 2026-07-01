package org.example.java.n5.busca;

// Calculate the sum of all elements in a matrix.
public class Ex12_2 {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 10, 15, 21, 30, 42};

        System.out.print(binarySearch(numbers, 9));

    }

    public static boolean binarySearch(int[] numbers,int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if (target < numbers[mid]) {
                right = mid - 1;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
