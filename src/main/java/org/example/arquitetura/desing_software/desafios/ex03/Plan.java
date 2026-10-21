package org.example.arquitetura.desing_software.desafios.ex03;

public enum Plan {
    BASIC(50),
    PREMIUM(100),
    BUSINESS(200);


    private final int limit;

    Plan(int limit) {
        this.limit = limit;
    }

    public static double planType(Plan p) {
       if(p == Plan.BASIC){
           return 50.00;
       }else if(p == Plan.PREMIUM){
           return 100.00;
       }else if(p == Plan.BUSINESS){
           return 200.00;
       }
       throw new RuntimeException("Plan does not exist");
    }

}
