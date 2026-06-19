package org.example.java.n4.matrizes;

// Calculate the sum of all elements in a matrix.
public class Ex1 {
    public static void main(String[] args) {

        int[][] matrix = {
                {5}
        };

        System.out.println(sumMatrix(matrix));

    }

    public static int sumMatrix(int[][] matrix){
        int sumMatrix = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumMatrix += matrix[i][j];
            }
        }

        return  sumMatrix ;
    }

}
