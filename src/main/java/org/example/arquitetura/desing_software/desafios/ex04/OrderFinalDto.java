package org.example.arquitetura.desing_software.desafios.ex04;

public class OrderFinalDto {
    private int totalOrders = 0;
    private int processOrders = 0;
    private double valueBegin = 0.0;
    private double discountPix = 0.0;
    private double taxiByCreditCard = 0.0;
    private double deliver = 0.0 ;


    public void addValueBegin(double amount){
        valueBegin += amount;
    }

    public void addProcessOrder(){
        processOrders++;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public void addAdditionDiscount(Payment p,double amount){
        DiscountAdditionDto daDto = p.paymentWithDiscount(amount);
        discountPix += daDto.getDiscount();
        taxiByCreditCard +=daDto.getAddition();
    }

    public void addDeliver(double amount){
        deliver += amount;
    }
    public double addValueFinal(){
        return valueBegin + taxiByCreditCard + deliver - discountPix;
    }

    @Override
    public String toString() {
        return  "Pedidos recebidos " + totalOrders + "\n"+
                "Pedidos processados " + processOrders + "\n"+
                "Pedidos não processados " + (totalOrders - processOrders) + "\n"+
                "Soma dos valores originais processados: " + valueBegin + "\n"+
                "Total de descontos PIX: " + discountPix + "\n"+
                "Total de acréscimos do cartão: " + taxiByCreditCard + "\n"+
                "Total de taxas de entrega: " + deliver + "\n"+
                "Valor final total: "  +addValueFinal();
    }
}
