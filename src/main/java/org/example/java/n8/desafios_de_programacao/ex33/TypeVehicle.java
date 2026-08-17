package org.example.java.n8.desafios_de_programacao.ex33;

public enum TypeVehicle {
    CAR,MOTORCYCLE;

    public static TypeVehicle fromString(String value) {
        if (value.equals("CAR")) {
            return CAR;
        } else if (value.equals("MOTORCYCLE")) {
            return MOTORCYCLE;
        } else {
            return null;
        }
    }
}
