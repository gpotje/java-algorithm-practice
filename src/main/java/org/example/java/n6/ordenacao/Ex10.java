package org.example.java.n6.ordenacao;


public class Ex10 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        insertSortStepTwo(numbers);
    }

    public static void insertSortStepTwo(int[] numbers) {
        int key = numbers[1];
        numbers[1] = numbers[0];
        numbers[0] = key;

       Util.printArray(numbers);


    }
}
