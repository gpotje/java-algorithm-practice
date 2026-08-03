package org.example.java.n7.logica.ex23;

import java.util.ArrayList;
import java.util.List;

public class ex23 {
    public static void main(String[] args) {
        List<String> commands  = List.of( "ADD_PRODUCT Notebook",
                "ADD_PRODUCT Mouse",
                "CREATE_ORDER João",
                "ADD_TO_ORDER João Notebook",
                "ADD_TO_ORDER João Mouse");

        System.out.println(processOrders(commands));
    }

    public static String processOrders(List<String> commands){

        OrderSystem os = new OrderSystem();

        for (String s : commands){
            String[] c = s.split(" ");
            if(c[0].equals("ADD_PRODUCT")){
                os.addProductInCatalog(new Product(c[1]));
            }
             else if(c[0].equals("CREATE_ORDER")){
                os.createOrder(c[1]);
            }
             else if(c[0].equals("ADD_TO_ORDER")) {
               os.addOrder(c[1],c[2]);
            }
            else if(c[0].equals("CANCEL_ORDER")) {
                os.cancelOrder(c[1]);
            }
            else if(c[0].equals("REMOVE_FROM_ORDER")) {
                os.removeOrder(c[1],c[2]);
            }
        }
        return os.stringToList();
    }
}
