package org.example.java.n8.desafios_de_programacao.ex40;

import org.example.java.n8.desafios_de_programacao.ex39.Customer;

import java.util.List;

public class ex40 {
    public static void main(String[] args) {
        List<String> commands = List.of(
                "REMOVE Mouse 5",
                "ADD Mouse 2",
                "STATUS"
        );

        System.out.println(processInventory(commands));
    }
    public static String processInventory(List<String> commands){
        Inventory i = new Inventory();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD")){
                i.addProduct(c[1],Integer.parseInt(c[2]));
            }
            else if(c[0].equals("REMOVE")){
                i.removeProduct(c[1],Integer.parseInt(c[2]));
            }
            else if(c[0].equals("STATUS")){
                System.out.println(i.status());
            }

        }

        return i.status();
    }
}
