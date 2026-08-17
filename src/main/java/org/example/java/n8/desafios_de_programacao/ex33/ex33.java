package org.example.java.n8.desafios_de_programacao.ex33;

import java.util.List;

public class ex33 {
    public static void main(String[] args) {
        List<String> commands = List.of(
                "ENTER ABC123 CAR",
                "ENTER XYZ789 MOTORCYCLE",
                "ENTER ABC123 CAR",
                "EXIT ABC123",
                "STATUS"
        );

        processParking(commands);
    }
    public static void processParking(List<String> commands){
        Parking parking = new Parking();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ENTER")){
                parking.enterVehicle(c[1],c[2]);
            }
            else if(c[0].equals("EXIT")){
                parking.exitVehicle(c[1]);
            }
            else if(c[0].equals("STATUS")){
                System.out.println(parking.status());
            }

        }
    }
}
