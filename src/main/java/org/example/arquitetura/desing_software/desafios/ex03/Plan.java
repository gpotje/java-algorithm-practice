package org.example.arquitetura.desing_software.desafios.ex03;

public enum Plan {
    BASIC(50),
    PREMIUM(100),
    BUSINESS(200);

    private final int limit;

    Plan(int limit) {
        this.limit = limit;
    }

    public double getPrice() {
        return limit;
    }
}
