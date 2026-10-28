package org.example.arquitetura.desing_software.desafios.ex04;

import java.util.List;

public class ServicePayment {

    private double deliver;
    private double discountFixed;

    public ServicePayment(double deliver) {
        this.deliver = deliver;
    }

    public OrderFinalDto calculateOrder(List<Order> listOrder){

        OrderFinalDto dto = new OrderFinalDto();
        dto.setTotalOrders(listOrder.size());

        for(Order o : listOrder){
            if(o.getStatus() != OrderStatus.CANCELLED && o.getPrice() >= 50.00){
                dto.addProcessOrder();
                if(o.getPrice() > 500) {
                    dto.addDeliver(deliver);
                }
                dto.addValueBegin(o.getPrice());
                dto.addAdditionDiscount(o.getPayment(),o.getPrice());
            }
        }
        return dto;
    }
}
