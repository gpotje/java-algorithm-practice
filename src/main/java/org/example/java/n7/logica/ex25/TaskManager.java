package org.example.java.n7.logica.ex25;

import org.example.java.n7.logica.ex23.Order;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<>();
    }
    public void addTask(String taskName){
        if(findTaskByName(taskName) == -1){
            tasks.add(new Task(taskName));
        }
    }
    public void completeTask(String taskName){
        int index = findTaskByName(taskName);
        if(index != -1){
            tasks.get(index).setTaskStatus(TaskStatus.COMPLETED);
        }
    }
    public void reOpenTask(String taskName){
        int index = findTaskByName(taskName);
        if(index != -1){
            tasks.get(index).setTaskStatus(TaskStatus.PENDING);
        }
    }
    public void removeTask(String taskName){
        int index = findTaskByName(taskName);
        if(index != -1){
            tasks.remove(index);
        }
    }
    public String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
            for(int i = 0; i <= tasks.size() -1; i++){
                if(i == tasks.size() -1){
                    sb.append(tasks.get(i).toString());
                }else {
                    sb.append(tasks.get(i).toString()+", ");
                }
            }
            sb.append("]");
        return sb.toString();
    }

    private int findTaskByName(String name){
        for (int i = 0; i <= tasks.size() -1 ; i++) {
            if(tasks.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
