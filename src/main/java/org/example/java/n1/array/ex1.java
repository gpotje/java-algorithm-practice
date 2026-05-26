package org.example.java.n1.array;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int biggestNumber  = 0;
        int smallestNumber = 0;
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter a number");

            number = scanner.nextInt();

            if(i == 0){
                biggestNumber  = number;
                smallestNumber = number;
            }

            if(number > biggestNumber ){
                biggestNumber  = number;
            }

            if(number < smallestNumber){
                smallestNumber = number;
            }

        }
        System.out.println("The smallest number was: "+smallestNumber);
        System.out.println("The biggest number  was: "+biggestNumber );

    }
}
