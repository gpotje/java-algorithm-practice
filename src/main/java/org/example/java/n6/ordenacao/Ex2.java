package org.example.java.n6.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex2 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        bubblePass(numbers);

    }

    public static void bubblePass(int[] numbers) {
        int count = numbers.length - 1;
        int aux = 0;
        printArray(numbers);
        System.out.println();

        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i = 0; i < numbers.length - 1 - pass; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                }
            }
        }
        System.out.println("===================================");
        printArray(numbers);
        System.out.println("===================================");

    }

    public static void printArray(int[] numbers) {
        System.out.print("{");
        for (int i = 0 ; i < numbers.length ; i++){
            if(i+1 == numbers.length){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i]+", ");
            }
        }
        System.out.print("}");
    }

}
