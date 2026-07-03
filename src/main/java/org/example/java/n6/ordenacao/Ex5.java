package org.example.java.n6.ordenacao;


public class Ex5 {
    public static void main(String[] args) {

        int[] numbers =  {-10, 50, -30, 0, 8};

        moveSmallestToFront(numbers);
    }

    public static void moveSmallestToFront(int[] numbers) {
        int smallest = numbers[0];
        int index = 0;
        int aux = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest ){
                smallest = numbers[i];
                index = i ;
            }
        }
        aux  = numbers[0];
        numbers[0] = numbers[index];
        numbers[index] = aux;


        printArray(numbers);
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
