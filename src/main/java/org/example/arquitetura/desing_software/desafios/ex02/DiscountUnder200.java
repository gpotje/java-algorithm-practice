package org.example.arquitetura.desing_software.desafios.ex02;

public class DiscountUnder200 implements Discount{
    @Override
    public double applyDiscount(double d) {
        if(d > 200){
          return (d * 0.10);
        }
        return 0.0;
    }
}
