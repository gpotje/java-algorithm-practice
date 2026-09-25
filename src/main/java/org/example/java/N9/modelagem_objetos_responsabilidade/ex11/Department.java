package org.example.java.N9.modelagem_objetos_responsabilidade.ex11;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employee;

    public Department(String name) {
        this.name = name;
        this.employee =  new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employee.add(e);
    }

    public double calculateTotalPayroll(){
        double sum = 0.0;
        for(Employee e:employee){
            sum += e.getTotalCompensation();
        }
        return  sum;
    }

}
