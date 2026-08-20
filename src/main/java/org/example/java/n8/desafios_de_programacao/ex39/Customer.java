package org.example.java.n8.desafios_de_programacao.ex39;

public class Customer {
    private String name;
    private int priority;

    public Customer(String name, int priority) {
        if(priority >= 1 &&  priority <= 3 ){
            this.name = name;
            this.priority = priority;
        }else {
            throw new IllegalArgumentException("Priority " +priority+ "doesn't exist");
        }

    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name +"("+priority+")";
    }
}
