package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex13 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("the biggest sun index is: "+columnWithLargestSum(matrix));
    }

    public static int columnWithLargestSum(int[][] matrix){
        int columnWithLargestSum = 0 ;
        int columnSum = 0;
        int largestColumnSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                columnSum += matrix[j][i];
            }
            if(columnSum > largestColumnSum){
                largestColumnSum = columnSum;
                columnWithLargestSum = i;
            }
            columnSum = 0;
        }
        return columnWithLargestSum;
    }

}
