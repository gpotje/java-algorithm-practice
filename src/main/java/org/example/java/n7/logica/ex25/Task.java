package org.example.java.n7.logica.ex25;

public class Task {
    private String name;
    private TaskStatus taskStatus;

    public Task(String name) {
        this.taskStatus = TaskStatus.PENDING;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return name +" ("+ taskStatus +")";
    }
}
