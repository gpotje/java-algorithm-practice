package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex20 {
    public static void main(String[] args) {
        List<String> commands  = List.of(          "RESERVE SalaA",
                "RESERVE SalaB",
                "CANCEL SalaA");

        System.out.println(processReservations(commands));
    }

    public static List<String> processReservations(List<String> commands){

        ArrayList<String> newQueue = new ArrayList<>();

        for (String s : commands){
            String[] c = s.split(" ");
            int index = -1 ;
            if(!c[0].equals("STATUS")){
                index = findIndex(newQueue,c[1]);
            }
            if(c[0].equals("RESERVE") && index == -1){
                newQueue.add(c[1]);
            }else if (c[0].equals("CANCEL") && index != -1){
                newQueue.remove(index);
            }

        }
        return  newQueue;
    }
    public static int findIndex(List <String> newQueue,String word){
        for (int i = 0; i <= newQueue.size() -1 ; i++) {
            if(newQueue.get(i).equals(word)){
                return i;
            }
        }
        return -1;
    }
}
