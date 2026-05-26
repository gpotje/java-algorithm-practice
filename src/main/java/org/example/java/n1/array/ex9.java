package org.example.java.n1.array;

public class ex9 {
    public static void main(String[] args) {

        //int numbers[] = {1, 0, 2, 0, 3, 0, 4}; // test 1°
        //int numbers[] = {0, 0, 0}; // test 2°
        int numbers[] = {1, 2, 3}; // test 3°

        int countZero = 0;
        int countNumeber = 0;
        int arryFinal = 0;
        int arrayZero[];
        int arraynumbers[];


        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                countZero ++;
            }else{
                countNumeber ++;
            }
        }

        arrayZero = new int[countZero];
        arraynumbers = new int[countNumeber];
        countNumeber = 0;
        countZero = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                arrayZero[countZero] = numbers[i];
                countZero ++;
            }else{
                arraynumbers[countNumeber] = numbers[i];
                countNumeber ++;
            }
        }



        for(int i = 0; i < arraynumbers.length; i++){
            numbers[arryFinal] = arraynumbers[i];
            arryFinal++;
        }
        for(int i = 0; i < arrayZero.length; i++){
            numbers[arryFinal] = arrayZero[i];
            arryFinal++;
        }

        System.out.println("============ Array Final ============");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+", ");
        }


    }
}
