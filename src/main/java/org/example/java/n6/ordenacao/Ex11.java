package org.example.java.n6.ordenacao;


public class Ex11 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        insertSortStepTwo(numbers);
    }

    public static void insertSortStepTwo(int[] numbers) {
        int key = numbers[1];
        int j = 0;

        if (key < numbers[j]) {
            numbers[j + 1] = numbers[j];
            numbers[j] = key;
        }

       Util.printArray(numbers);


    }
}
