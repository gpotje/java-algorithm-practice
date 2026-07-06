package org.example.java.n6.ordenacao;


public class Ex9 {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        insertSortStepTwo(numbers);
    }

    public static void insertSortStepTwo(int[] numbers) {
        int aux = numbers[1];
        //guardei o numeber[1] para o proximo passo
        numbers[1] = numbers[0];

       Util.printArray(numbers);
       // Util é uma classe separada que deixei o metodo static printArray

    }
}
