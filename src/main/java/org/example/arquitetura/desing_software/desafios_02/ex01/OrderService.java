package org.example.arquitetura.desing_software.desafios_02.ex01;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {
    public ResponseOrderDto calculateOrder(List<Order> orderList){
        ResponseOrderDto dto = new ResponseOrderDto();
        dto.setOrderReceived(orderList.size());
        for(Order o : orderList){
            if (o.getOrderStatus() != OrderStatus.CANCELLED
                    && o.getPrice() >= 100.00) {
                dto.addAmountTaxDeliverTotal(o.getDeliveryType().getPrice());
                dto.incrementOrderProcessed();
                dto.addAmountInitialTotal(o.getPrice());
                dto.addAmountDiscount(o.getPrice());
                }
        }
        return dto;
    }
}
