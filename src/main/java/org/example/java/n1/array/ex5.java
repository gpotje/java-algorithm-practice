package org.example.java.n1.array;

public class ex5 {
    public static void main(String[] args) {

        int numbers[] = {1, 5, 2, 5, 8, 5, 3};
        int number = 99;
        int count = 0;
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] == number){
                count ++;
            }
        }

        System.out.println("Number "+number+" appears "+count+" times");

    }
}
