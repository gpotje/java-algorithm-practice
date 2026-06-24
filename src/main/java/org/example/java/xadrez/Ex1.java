package org.example.java.xadrez;

// Calculate the sum of all elements in a matrix.
public class Ex1 {
    public static void main(String[] args) {

        String[][] board = {
                {"♜","♞","♝","♛","♚","♝","♞","♜"},
                {"♟","♟","♟","♟","♟","♟","♟","♟"},
                {".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".","."},
                {".",".",".",".",".",".",".","."},
                {"♙","♙","♙","♙","♙","♙","♙","♙"},
                {"♖","♘","♗","♕","♔","♗","♘","♖"}
        };

        desenhaTabuleiro(board);

    }

    public static void desenhaTabuleiro(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
