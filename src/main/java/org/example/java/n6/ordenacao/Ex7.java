package org.example.java.n6.ordenacao;


public class Ex7 {
    public static void main(String[] args) {

        int[] numbers =  {5, 2, 9, 1, 7};

        selectionSort(numbers);
    }

    public static void selectionSort(int[] numbers) {
        int aux = 0;

        for (int i = 0; i < numbers.length -1 ; i++) {
            int smallest = numbers[i];
            int indexTrade = i;
            for (int j = i; j < numbers.length; j++) {
                if (smallest > numbers[j]) {
                    smallest = numbers[j];
                    indexTrade = j;
                }
            }
            aux = numbers[indexTrade];
            numbers[indexTrade] = numbers[i];
            numbers[i] = aux;

        }
       Util.printArray(numbers);
    }
}
