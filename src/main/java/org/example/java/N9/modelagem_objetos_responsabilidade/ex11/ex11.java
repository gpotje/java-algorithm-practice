package org.example.java.N9.modelagem_objetos_responsabilidade.ex11;

public class ex11 {
    public static void main(String[] args) {
        Employee m =  new Manager("João",15000.0,2);
        Employee d1 = new Developer("Gabriel",10000.0);
        Employee d2 = new Developer("Lucas",10000.0);

        Department department = new Department("Informatica");
        department.addEmployee(m);
        department.addEmployee(d1);
        department.addEmployee(d2);

        System.out.println(department.calculateTotalPayroll());
    }
}
