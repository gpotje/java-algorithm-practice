package org.example.arquitetura.desing_software.desafios.ex03;

public class Customer {
    private String name;
    private Plan plan;
    private int additionalServices;
    private PaymentStatus paymentStatus;
    private boolean blocked;

    public Customer(String name, boolean blocked, PaymentStatus paymentStatus, int additionalServices, Plan plan) {
        this.name = name;
        this.blocked = blocked;
        this.paymentStatus = paymentStatus;
        this.additionalServices = additionalServices;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public int getAdditionalServices() {
        return additionalServices;
    }

    public Plan getPlan() {
        return plan;
    }
}
