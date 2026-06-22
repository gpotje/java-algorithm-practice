package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex8 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Diagonal sum: "+sumSecondaryDiagonal(matrix));

    }

    public static int sumSecondaryDiagonal(int[][] matrix){
        int sumSecondaryDiagonal = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sumSecondaryDiagonal += matrix[i][n - 1 - i];
        }
        return sumSecondaryDiagonal;
    }

}
