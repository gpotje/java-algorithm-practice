package org.example.java.n1.array;

public class ex11 {
    public static void main(String[] args) {

        //int numbers[] = {1, 2, 3, 4, 5}; // test 1°
        // int numbers[] = {1, 5, 3, 4}; // test 2°
        //int numbers[] = {1}; // test 3°
        //int numbers[] = {}; // test 4°
        int numbers[] =  {1, 3, 7, 10}; // test 5°

         int sideArray = numbers.length - 1;

        if (numbers.length > 0) {
                for(int i = 0; i < sideArray; i++){
                        if(numbers[i] > numbers[i+1]){
                                System.out.println("Array is not sorted");
                                return;
                        }
                }
                System.out.println("Array is sorted");
        }else{
            System.out.println("Array cannot be empty");
        }
    }
}
