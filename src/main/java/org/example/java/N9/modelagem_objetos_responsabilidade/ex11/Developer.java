package org.example.java.N9.modelagem_objetos_responsabilidade.ex11;

public class Developer extends Employee{

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.15;
    }
}
