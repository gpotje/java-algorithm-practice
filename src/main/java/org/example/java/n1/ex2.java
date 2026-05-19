package org.example.java.n1;

public class ex2 {
    public static void main(String[] args) {

        int numbers[] = {1 ,-2, 3, 4 ,-1, 6 ,-8, 2};
        int positiveCount = 0;
        int positiveSum  = 0 ;
        double positiveAverage   = 0;

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > 0){
                System.out.print(numbers[i]+",");
                positiveCount ++;
                positiveSum  = positiveSum  + numbers[i];
            }
        }
        System.out.println();
        positiveAverage  = (double)  positiveSum  / positiveCount;


        System.out.println("Was : " + numbers.length +" numbers");
        System.out.println("Sum All number : " + positiveSum );
        System.out.println("Average number : " + positiveAverage );


    }
}
