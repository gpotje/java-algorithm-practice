package org.example.java.n7.logica.ex25;

import java.util.List;

public class ex25 {
    public static void main(String[] args) {
        List<String> commands  = List.of( "ADD_TASK Java",
                "COMPLETE Java",
                "REOPEN Java");

        System.out.println(processTasks(commands));
    }
    public static String processTasks(List<String> commands){

        TaskManager tm = new TaskManager();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD_TASK")){
                tm.addTask(c[1]);
            }
            else if(c[0].equals("COMPLETE")){
                tm.completeTask(c[1]);
            }
            else if(c[0].equals("REOPEN")){
                tm.reOpenTask(c[1]);
            }
            else if(c[0].equals("REMOVE")){
                tm.removeTask(c[1]);
            }

        }

        return tm.stringToList();
    }
}
