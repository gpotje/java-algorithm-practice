package org.example.java.n1.array;
/*
* Você acabou de resolver um problema que é a base conceitual de um HashMap<Integer, Integer>.
* */

public class ex15 {
    public static void main(String[] args) {

        //int numbers[] = {5, 9, 2, 15, 7, 12}; // test 1°
        //int numbers[] =  {15, 15, 10, 8} ;// test 2°
        int numbers[] =   {15, 15, 10, 8}; ;// test 3°
        int biggestNumber = numbers[0];
        int secondBiggestNumber  = 0 ;


        if(numbers.length == 0){
            System.out.println("Array cannot be empty");
            return;
        }

        for(int i =0; i < numbers.length; i++){
             if(numbers[i] > biggestNumber){
                secondBiggestNumber = biggestNumber;
                biggestNumber = numbers[i];
            }
            else if(numbers[i] > secondBiggestNumber && numbers[i] != biggestNumber ){
                secondBiggestNumber = numbers[i];
            }

        }
        System.out.println("Biggest: "+biggestNumber);
        System.out.println("Second biggest: "+secondBiggestNumber);
    }
}
