package org.example.java.n1.array;

public class ex8 {
    public static void main(String[] args) {

        //int numbers[] = {4, 9, 2, 15, 7}; // test 1°
        //int numbers[] = {-10, -2, -30, -1}; // test 2°
        int numbers[] = {5}; // test 3°

        int biggestNumber = numbers[0];
        int index = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > biggestNumber){
                biggestNumber  = numbers[i];
                index = i;
            }
        }

        System.out.println("Biggest number: "+biggestNumber);
        System.out.println("Index: "+index);
    }
}
