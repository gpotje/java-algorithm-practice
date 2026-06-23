package org.example.java.n4.matrizes;

//Calculate the sum each line in a matrix
public class Ex12 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("the biggest sun index is: "+rowWithLargestSum(matrix));
    }

    public static int rowWithLargestSum(int[][] matrix){
        int rowWithLargestSum = 0 ;
        int sumLineFirst = 0;
        int finalSumLine = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumLineFirst += matrix[i][j];
            }
            if(sumLineFirst > finalSumLine){
                finalSumLine = sumLineFirst;
                rowWithLargestSum = i;
            }
            sumLineFirst = 0;
        }
        return rowWithLargestSum;
    }

}
