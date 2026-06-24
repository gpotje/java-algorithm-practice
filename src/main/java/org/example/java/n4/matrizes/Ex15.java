package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex15 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate90Right(matrix);
    }

    public static void rotate90Right(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

}
