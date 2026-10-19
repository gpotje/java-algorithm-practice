package org.example.arquitetura.desing_software.desafios.ex02;

import java.util.List;

public class OrderService {

    private Discount discount;

    public OrderService(Discount discount) {
        this.discount = discount;
    }

   public CalculateOrderDto calculateOrder(List<Order> orders){

       CalculateOrderDto dto = new CalculateOrderDto();

       for (Order o : orders){
            if(o.getStatusOrder() != StatusOrder.CANCELLED){
                dto.addDiscount(discount.applyDiscount(o.getTotalOrder()));
                dto.addValueTotal(o.getTotalOrder());
                dto.incrementOrderValid();
            }
        }
       return dto;
    }
}
