package org.example.arquitetura.desing_software.desafios.ex03;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("Ana", false, PaymentStatus.PAID, 3, Plan.BASIC),
                new Customer("Carlos", false, PaymentStatus.PAID, 8, Plan.PREMIUM),
                new Customer("Maria", false, PaymentStatus.OVERDUE, 10, Plan.BUSINESS),
                new Customer("João", true, PaymentStatus.OVERDUE, 6, Plan.BASIC),
                new Customer("Pedro", false, PaymentStatus.OVERDUE, 0, Plan.PREMIUM)
        };

        List<Customer> customerList = List.of(customers);

        ServicesPlan plan = new ServicesPlan();
        var d = plan.calculateAllPlanCustomer(customerList);
        System.out.println(d.toString());

    }
}
