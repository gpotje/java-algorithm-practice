package org.example.java.n8.desafios_de_programacao.ex26;

import java.util.List;

public class ex26 {
    public static void main(String[] args) {

        List<String> commands  = List.of(  "ADD A",
                "ADD B",
                "ADD C",
                "POWER B",
                "STATUS");

        System.out.println(processNetwork(commands));

    }

    public static String processNetwork(List<String> commands){

        NetworkManager nm = new NetworkManager();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD")){
                nm.addDevice(c[1]);
            }
            else if(c[0].equals("CONNECT")){
                nm.connectDevices(c[1],c[2]);
            }
            else if(c[0].equals("POWER")){
                System.out.println();
               nm.powerDevices(c[1]);
            }

        }

        return nm.stringToList();
    }
}
