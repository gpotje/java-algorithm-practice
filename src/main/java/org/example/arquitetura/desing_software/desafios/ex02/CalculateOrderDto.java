package org.example.arquitetura.desing_software.desafios.ex02;

public class CalculateOrderDto {
    private int orderValid;
    private double originTotal;
    private double discount;

    public CalculateOrderDto() {
    }

    public void incrementOrderValid(){
        orderValid++;
    }

    public void addDiscount(double o){
        discount += o;
    }
    public void addValueTotal(double o){
        originTotal += o;
    }
    private double calculateFinalTotal(){
        return originTotal - discount;
    }

    @Override
    public String toString() {
        return "Pedidos válidos: "+orderValid +"\n"+
                "Total original: R$ "+originTotal +"\n"+
                "Descontos: R$ "+discount +"\n"+
                "Total final: R$ "+calculateFinalTotal();
    }
}
