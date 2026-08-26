package org.example.java.n8.desafios_de_programacao;

public class Ex41 {
    public static void main(String[] args) {
        //String test1 = "()";
        //String test1 = "(())";
       // String test1 = "()()";
        //String test1 = "(()())";
        //String test1 = "(";
        //String test1 = ")(";
        //String test1 = "())";
        //String test1 = "(()";
        //String test1 = "";
        //String test1 = "((()))()";
        String test1 = "())(()";

        System.out.println(isBalanced(test1));
    }

    public static boolean isBalanced(String expression) {

        if (expression.length() <= 1) {
            return false;
        }

        int count = 0;

        for (int i = 0; i <= expression.length() - 1; i++) {

            if (expression.charAt(i) == '(') {
                count++;
            } else if (expression.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                return false;
            }

        }
        return count == 0;
    }}

