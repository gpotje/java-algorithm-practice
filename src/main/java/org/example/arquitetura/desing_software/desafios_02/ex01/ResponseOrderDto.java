package org.example.arquitetura.desing_software.desafios_02.ex01;
public class ResponseOrderDto {
    private int orderReceived;
    private int orderProcessed;

    private double initialTotal;
    private double discountTotal;
    private double taxDeliverTotal;

    public ResponseOrderDto() {
        this.orderReceived = 0;
        this.orderProcessed = 0;
        this.initialTotal = 0.0;
        this.discountTotal = 0.0;
        this. taxDeliverTotal = 0.0;
    }

    public void setOrderReceived(int orderReceived) {
        this.orderReceived = orderReceived;
    }
    public void incrementOrderProcessed(){
        this.orderProcessed++;
    }
    private double calculateFinalTotal() {
        return  (initialTotal + taxDeliverTotal) - discountTotal;
    }
    public void addAmountInitialTotal(double amount){
        this.initialTotal += amount;
    }
    public void addAmountDiscount(double amount){
        if(amount > 500){
            this.discountTotal += amount*0.10;
        }
    }
    public void addAmountTaxDeliverTotal(double amount){
        taxDeliverTotal += amount;
    }

    @Override
    public String toString() {
        return "Pedidos recebidos: " + orderReceived + "\n" +
                "Pedidos processados: " + orderProcessed + "\n" +
                "Pedidos rejeitados: " + (orderReceived - orderProcessed) + "\n" +
                "Valor original total: R$  " +initialTotal  + "\n" +
                "Total de descontos: R$  " + discountTotal + "\n" +
                "Total de entregas: R$  "  + taxDeliverTotal + "\n" +
                "Valor final total: R$ " +calculateFinalTotal();
    }
}
