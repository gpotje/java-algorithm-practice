package org.example.arquitetura.desing_software.desafios_02.ex01;

public enum DeliveryType {
    STANDARD(15),
    EXPRESS(30),
    PICKUP(0);

    private final int limit;

    DeliveryType(int limit) {
        this.limit = limit;
    }

    public double getPrice() {
        return limit;
    }
}
