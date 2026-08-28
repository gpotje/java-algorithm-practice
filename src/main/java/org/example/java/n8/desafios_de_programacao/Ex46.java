package org.example.java.n8.desafios_de_programacao;

import java.util.ArrayList;
import java.util.List;

public class Ex46 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transpose(matrix);
    }

    public static int[][] transpose(int[][] matrix) {

        printMatrix(transposeMatrix(matrix));

        return null;
    }
    public static int[][] transposeMatrix(int[][] matrix){
        int linhas = matrix.length;
        int colunas = matrix[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                transposta[j][i] = matrix[i][j];
            }
        }
        return transposta;
    }


    public static void printMatrix(int[][] matrix){
        int linhas = matrix.length;
        int colunas = matrix[0].length;

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                if(j == 0){
                    System.out.print("{");
                    System.out.print(matrix[i][j]);
                    System.out.print(",");
                }else if(j == matrix.length){
                    System.out.print(matrix[i][j]);
                    System.out.print("}");
                }else {
                    System.out.print(matrix[i][j]);
                    System.out.print(",");
                }

            }
            System.out.println();
        }

    }

}

