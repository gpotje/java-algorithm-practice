package org.example.java.n6.ordenacao;

public class Util {
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
