package org.example.java.n8.desafios_de_programacao.ex33;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<Vehicle> vehicles;

    public Parking() {
        this.vehicles = new ArrayList<>();
    }

    public void enterVehicle(String numberPlate, String type){
            int index = findVehiclesByName(numberPlate);
            if(index == -1){
                vehicles.add(new Vehicle(numberPlate,TypeVehicle.fromString(type)));
            }
    }

    public void exitVehicle(String numberPlate){
        int index = findVehiclesByName(numberPlate);
        if(index != -1){
            vehicles.remove(index);
        }
    }

    public String status(){
        return stringToList();
    }

    private int findVehiclesByName(String name){
        for (int i = 0; i <= vehicles.size() -1 ; i++) {
            if(vehicles.get(i).getPlate().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i <= vehicles.size() -1; i++){
            if(i == vehicles.size() -1){
                sb.append(vehicles.get(i).toString());
            }else {
                sb.append(vehicles.get(i).toString()+", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
