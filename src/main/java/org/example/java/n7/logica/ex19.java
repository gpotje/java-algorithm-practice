package org.example.java.n7.logica;

import java.util.ArrayList;
import java.util.List;

public class ex19 {
    public static void main(String[] args) {
        List<String> commands  = List.of("REMOVE Mouse","ADD Mouse");

        System.out.println(processStock(commands));
    }

    public static List<String> processStock(List<String> commands){

        ArrayList<String> newQueue = new ArrayList<>();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD")){
                newQueue.add(c[1]);
            }else if (c[0].equals("REMOVE")){
                int index = findIndex(newQueue,c[1]);
                if( index != -1){
                    newQueue.remove(index);
                }
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
