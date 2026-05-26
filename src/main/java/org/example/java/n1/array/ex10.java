package org.example.java.n1.array;

public class ex10 {
    public static void main(String[] args) {

         //int numbers[] = {1, 2, 3, 4, 5}; // test 1°
        //int numbers[] = {10, 20, 30}; // test 2°
        //int numbers[] = {1}; // test 3°
        int numbers[] = {}; // test 3°

        if (numbers.length > 0) {
            int positionArray = numbers.length - 1;
            int nextNumber = 0;

                while(positionArray > 0){
                    nextNumber = numbers[positionArray-1];
                    numbers[positionArray-1] = numbers[positionArray];
                    numbers[positionArray] = nextNumber;
                    positionArray--;
                }

                System.out.println("============ Array Final ============");
                for(int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i]+", ");
                }
        }else{
            System.out.println("============ Array cannot be empty ============");
        }
    }
}
