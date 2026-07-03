package org.example.java.n6.ordenacao;

// Calculate the sum of all elements in a matrix.
public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = {5,2,9,1,7};

        printArray(swap(numbers, 0, 4));

    }

    public static int[] swap(int[] numbers, int index1, int index2) {

        int aux = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = aux;

        return numbers;
    }

    public static void printArray(int[] numbers) {
        System.out.print("{");
        for (int i = 0 ; i < numbers.length; i++){
            if(i+1 == numbers.length){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i]+", ");
            }
        }
        System.out.print("}");
    }

}
