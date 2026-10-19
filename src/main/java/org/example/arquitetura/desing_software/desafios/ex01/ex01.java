package org.example.arquitetura.desing_software.desafios.ex01;

public class ex01 {
    public static void main(String[] args) {
        double[] prices = {150.00};
        print(calculator(prices));
    }

    public static double[] calculator(double[] d){
        double[] s = new double[3];
        for(int i = 0; i < d.length; i++){
            s[0] = s[0] + d[i];
        }
        if(s[0] > 100){
            s[1] =  s[0] * 0.10;
            s[2] =  s[0] - s[1];
        }else {
            s[2] = s[0];
        }
       return s;
    }

    public static void print(double[] d){
        System.out.println("Total original: "+d[0]);
        System.out.println("Desconto: "+d[1]);
        System.out.println("Total a pagar "+d[2]);
    }

}
