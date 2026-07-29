package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex18 {
    public static void main(String[] args) {
        List<String> queue =List.of("Ana");
        List<String> commands  = List.of("NEXT","NEXT","ARRIVE Pedro");

        System.out.println(processQueue(queue,commands));
    }

    public static List<String> processQueue(List<String> queue, List<String> commands){

        ArrayList<String> newQueue = new ArrayList<>(queue);

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ARRIVE")){
                newQueue.add(c[1]);
            }else if (c[0].equals("NEXT") && newQueue.size() > 0){
                newQueue.remove(0);
            }
        }
        return  newQueue;
    }
}
