package org.example.java.n3.metodos;

// Return the average of all numbers in an array.
public class Ex3 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4};

        if(numeros.length <= 0){
            System.out.println("Array não pode ser vazio");
            return;
        }

        System.out.println(average(numeros));

    }

    public static double average(int[] numbers){

        double sumNumber = 0 ;
        for(int i = 0; i< numbers.length;i++) {
            sumNumber += numbers[i];
        }
        return sumNumber/numbers.length;
    }

}
