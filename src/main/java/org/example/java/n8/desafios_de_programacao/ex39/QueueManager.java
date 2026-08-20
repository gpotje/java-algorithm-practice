package org.example.java.n8.desafios_de_programacao.ex39;

import java.util.ArrayList;
import java.util.List;

public class QueueManager {
    private List<Customer> customers;

    public QueueManager() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }
    public void serve(){
        int index = findCostumerBiggestPriority();
        if(index != -1){
            customers.remove(index);
        }
    }

    public void status() {
        System.out.println(stringToList());
    }

    private int findCostumerBiggestPriority(){
        for (int i = 3; i >= 1 ; i--) {
            for(int j = 0; j <= customers.size() -1 ; j++){
                if(customers.get(j).getPriority() == i){
                    return j;
                }
            }
        }
        return -1;
    }

    public String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i <= customers.size() -1; i++){
            if(i == customers.size() -1){
                sb.append(customers.get(i).toString());
            }else {
                sb.append(customers.get(i).toString()+", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
