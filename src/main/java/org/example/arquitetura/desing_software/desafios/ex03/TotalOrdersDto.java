package org.example.arquitetura.desing_software.desafios.ex03;

public class TotalOrdersDto {
    private int totalCustomer;
    private double feesMonthly;
    private double totalDiscount;
    private double totalFines;
    private double totalCharges;



    public void addCustomer(){
        totalCustomer++;
    }

    public void addDiscount(int q){
        totalDiscount += PaymentStatus.calculatePlanExtra(q);
    }

    public void addMonthly(double d){
        feesMonthly += d;
    }

     private double addCharges(){
       return totalCharges = feesMonthly + totalDiscount + totalFines;
    }

    public void addFines(){
        totalFines += 25;
    }


    @Override
    public String toString() {
        return "* Clientes cobrados: " +totalCustomer+ "\n"+
                " * Total das mensalidades: R$ " + feesMonthly+ "\n"+
                " * Total dos serviços extras após descontos: R$"+totalDiscount + "\n"+
                " * Total das multas: R$ "+totalFines + "\n"+
                " * Valor total das cobranças: R$ " +addCharges();
    }
}
