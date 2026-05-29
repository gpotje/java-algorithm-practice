package org.example.java.n1.array;

public class ex13 {
    public static void main(String[] args) {

        //int numbers[] = {4, 2, 7, 1, 2, 9, 7}; // test 1°
        //int numbers[] =  {1, 3, 5, 7} ;// test 2°
        int numbers[] =  {5, 5, 5, 5} ;// test 3°

        if(numbers.length == 0){
            System.out.println("Array cannot be empty");
            return;
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println("First repeated number: "+numbers[i] );
                    return;
                }

            }
        }
        System.out.println("No repeated numbers");

    }
}
