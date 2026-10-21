package org.example.arquitetura.desing_software.desafios.ex03;

public enum PaymentStatus {
    PAID(15)
    , OVERDUE(15);

    private final int limit;

    PaymentStatus(int limit) {
        this.limit = limit;
    }

    }
