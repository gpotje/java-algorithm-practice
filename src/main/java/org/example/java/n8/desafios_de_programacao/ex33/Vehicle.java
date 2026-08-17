package org.example.java.n8.desafios_de_programacao.ex33;

public class Vehicle {
    private String plate;
    private TypeVehicle type;

    public Vehicle(String plate, TypeVehicle type) {
        this.plate = plate;
        this.type = type;
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return plate + " ("+type+") ";
    }
}
