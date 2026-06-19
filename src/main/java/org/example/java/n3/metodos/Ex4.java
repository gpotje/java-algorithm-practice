package org.example.java.n3.metodos;

// Return the biggest number in an array.
public class Ex4 {
    public static void main(String[] args) {

        int[] numeros = {5};

        System.out.println(findBiggest(numeros));

    }

    public static int findBiggest(int[] numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int biggestNumber = Integer.MIN_VALUE ;
        for(int i = 0; i < numbers.length;i++) {
            if(biggestNumber < numbers[i]){
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }

}
