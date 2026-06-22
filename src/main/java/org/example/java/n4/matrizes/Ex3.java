package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex3 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        sumLine(matrix);
    }

    public static void sumLine(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int sumColums = 0 ;
            for (int j = 0; j < matrix.length; j++) {
                sumColums += matrix[j][i];
            }
            System.out.println("Column : " +i+" sum: "+sumColums);
        }
    }

}
