package org.example.java.n8.desafios_de_programacao.ex39;

import java.util.List;

public class ex39 {
    public static void main(String[] args) {
        List<String> commands1 = List.of(
                "SERVE",
                "STATUS"
        );
        System.out.println(processQueue(commands1));

    }

    public static String processQueue(List<String> commands){

        QueueManager qm = new QueueManager();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD")){
                qm.addCustomer(new Customer(c[1],Integer.parseInt(c[2])));
            }
            else if(c[0].equals("SERVE")){
                qm.serve();
            }
            else if(c[0].equals("STATUS")){
                System.out.println();
               qm.status();
            }

        }

        return qm.stringToList();
    }
}
