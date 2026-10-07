package org.example.java.N9.modelagem_objetos_responsabilidade.ex14;

public class Order {
    private double totalAmount;
    private DiscountPolicy discountPolicy;
    private OrderNotification notification;

    public Order(double totalAmount, OrderNotification notification, DiscountPolicy discountPolicy) {
        this.totalAmount = totalAmount;
        this.notification = notification;
        this.discountPolicy = discountPolicy;
    }

    public double calculateFinalPrice(){
        double value = totalAmount - discountPolicy.applyDiscount(totalAmount);
        return Math.max(0.0, value);
    }

    public double processOrder(String customerContact){
        double finalPrice = calculateFinalPrice();
        notification.sendNotification(customerContact,finalPrice);
        return finalPrice;
    }
}
