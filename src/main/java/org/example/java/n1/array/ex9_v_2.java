package org.example.java.n1.array;

public class ex9_v_2 {
    public static void main(String[] args) {

        int numbers[] = {1, 0, 2, 0, 3, 0, 4}; // test 1°
        //int numbers[] = {0, 0, 0}; // test 2°
        //int numbers[] = {1, 2, 3}; // test 3°

        int positionArray = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                numbers[positionArray] = numbers[i];
                positionArray ++;
            }
        }

        while(positionArray < numbers.length){
                numbers[positionArray] = 0;
                positionArray ++;
        }

        System.out.println("============ Array Final ============");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+", ");
        }

    }
}
