package org.example.arquitetura.desing_software.desafios.ex03;

import java.util.List;

public class ServicesPlan {

    public TotalOrdersDto calculateAllPlanCustomer(List<Customer> customerList){
        TotalOrdersDto dto = new TotalOrdersDto();

        for(Customer c: customerList){
            if(!c.isBlocked()){
                dto.addMonthly(c.getPlan().getPrice());
                dto.addCustomer();
                if(c.getPaymentStatus() == PaymentStatus.OVERDUE){
                    dto.addFines();
                }
                dto.addDiscount(c.getAdditionalServices());
            }
        }

        return dto;
    }


}
