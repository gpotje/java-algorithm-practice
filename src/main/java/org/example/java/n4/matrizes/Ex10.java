package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex10 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transposeMatrix(matrix);
    }

    public static void transposeMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }

}
