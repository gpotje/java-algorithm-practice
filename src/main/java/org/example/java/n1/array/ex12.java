package org.example.java.n1.array;

public class ex12 {
    public static void main(String[] args) {

        //int numbers[] = {1, 1, 2, 2, 2, 3, 4, 4, 5}; // test 1°
        int numbers[] =  {7, 7, 7, 7} ;// test 2°

        if(numbers.length == 0){
            System.out.println("Array cannot be empty");
            return;
        }

        for(int i = 0; i < numbers.length; i++){
            if(i == numbers.length - 1 || numbers[i] != numbers[i + 1]){
                System.out.print(numbers[i] + ", ");
            }
        }

    }
}
