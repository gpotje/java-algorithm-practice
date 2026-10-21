package org.example.arquitetura.desing_software.desafios.ex03;

public enum PaymentStatus {
    PAID(15)
    , OVERDUE(15);

    private final int limit;

    PaymentStatus(int limit) {
        this.limit = limit;
    }

    public static double  calculatePlanExtra(int q){
        double sum = 0.0;
        if(q > 5){
            sum = q * 15;
            return  sum - (sum * 0.20);
        }
        sum = q * 15;
        return sum;
    }

    }
