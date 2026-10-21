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
        totalDiscount += this.calculatePlanExtra(q);
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

    private double calculatePlanExtra(int q) {
        double sum = 0.0;
        if (q > 5) {
            sum = q * 15;
            return sum - (sum * 0.20);
        }

        sum = q * 15;
        return sum;
    }
}
