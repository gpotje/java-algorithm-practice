package org.example.java.N9.modelagem_objetos_responsabilidade.ex11;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateBonus();

    public double getTotalCompensation(){
        return baseSalary + calculateBonus();
    }
}
