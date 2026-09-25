package org.example.java.N9.modelagem_objetos_responsabilidade.ex11;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return (baseSalary * 0.20) + (teamSize * 100.0);
    }
}
