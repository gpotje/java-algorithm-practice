package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex9 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Diagonal sum: "+sumBothDiagonals(matrix));

    }

    public static int sumBothDiagonals(int[][] matrix){
        int sum  = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum  += matrix[i][n - 1 - i];
            sum  += matrix[i][i];

        }

        if( n % 2 == 1 ){
            sum -= matrix[n / 2][n / 2];
        }

        return sum ;
    }

}
