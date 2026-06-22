package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex6 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Even numbers: "+countEvenNumbers(matrix));

    }

    public static int countEvenNumbers(int[][] matrix){
        int countEvenNumbers = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 == 0){
                    countEvenNumbers ++;
                }

            }
        }
        return countEvenNumbers;
    }

}
