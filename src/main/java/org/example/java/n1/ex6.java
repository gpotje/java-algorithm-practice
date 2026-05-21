package org.example.java.n1;

public class ex6 {
    public static void main(String[] args) {

       //int numbers[] = {4, 8, 1, 7, 2};
        int numbers[] = {-5, -2, -10, -1};
        int sumNumbers = 0;
        int biggestNumber = numbers[0];
        int SmallestNumber = numbers[0];

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > biggestNumber){
                biggestNumber  = numbers[i];
            }
            if(numbers[i] < SmallestNumber){
                SmallestNumber  = numbers[i];
            }
            sumNumbers = sumNumbers + numbers[i];
        }

        System.out.println("Sum "+sumNumbers);
        System.out.println("Biggest "+biggestNumber);
        System.out.println("Smallest "+SmallestNumber);

    }
}
