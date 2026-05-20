package org.example.java.n1;

public class ex3 {
    public static void main(String[] args) {

        int numbers[] = {5, 9, 2, 15, 7, 15, 3};
        int biggestNumber = numbers[0];
        int secondBiggestNumber  = 0 ;

        for(int i =0; i < numbers.length; i++){

            if(numbers[i] > biggestNumber){
                secondBiggestNumber = biggestNumber;
                biggestNumber = numbers[i];
            }
            else if(numbers[i] > secondBiggestNumber && numbers[i] != biggestNumber ){
                secondBiggestNumber = numbers[i];
            }

        }
        System.out.println("The biggest Number is: "+biggestNumber);
        System.out.println("The secund biggest Number is: "+secondBiggestNumber);

    }
}
