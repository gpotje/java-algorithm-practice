package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex4 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,9,6},
                {7,8,5}
        };
        System.out.println("Largest element: "+largestElement(matrix));

    }

    public static int largestElement(int[][] matrix){
        int largestElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i] >largestElement ){
                    largestElement = matrix[j][i];
                }

            }
        }
        return largestElement;
    }

}
