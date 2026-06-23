package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex11 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrix.length - 1);
        System.out.println(sumBorder(matrix));
    }

    public static int sumBorder(int[][] matrix){
        int sumberder = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( i == 0 || i == matrix.length - 1 ||j == 0 || j == matrix[i].length - 1){
                    sumberder += matrix[i][j];
                }
            }
        }
        return sumberder;
    }

}
