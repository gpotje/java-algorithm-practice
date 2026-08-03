package org.example.java.n7.logica.ex23;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem {
    private List<Product> catalog;
    private List<Order> orders;

    public OrderSystem() {
        this.catalog = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProductInCatalog(Product p){
        catalog.add(p);
    }

    public void createOrder(String name){
        orders.add(new Order(name));
    }
    public void addOrder(String name,String nameProduct){
        int indexUser = findOrderByName(name);
        int indexProductCatalog = findProductByName(nameProduct);
        if( indexProductCatalog != -1 && indexUser!= -1){
            orders.get(indexUser).addOrder(nameProduct);
        }else {
            System.out.println("Product or User there isn't");
        }
    }
    public void removeOrder(String name,String nameProduct){
        int indexUser = findOrderByName(name);
        int indexOrderNameProduct = findOrderByNameProduct(indexUser,nameProduct);

        if( indexOrderNameProduct != -1 && indexUser!= -1){
            orders.get(indexUser).getProducts().remove(indexOrderNameProduct);
        }else {
            System.out.println("Product or User there isn't");
        }
    }


    public void cancelOrder(String name){
        int indexUser = findOrderByName(name);
        if( indexUser!= -1){
            orders.remove(indexUser);
        }else {
            System.out.println("User there isn't");
        }
    }

    private int findProductByName(String name){
        for (int i = 0; i <= catalog.size() -1 ; i++) {
            if(catalog.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private int findOrderByName(String name){
        for (int i = 0; i <= orders.size() -1 ; i++) {
            if(orders.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    private int findOrderByNameProduct(int index,String nameProduct){
       for( int j = 0; j <= orders.get(index).getProducts().size() -1 ; j++){
           if(orders.get(index).getProducts().get(j).getName().equals(nameProduct)) {
               return j;
           }

        }
            return -1;
    }


    public String stringToList(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Order order: orders){
            sb.append(order.getName()+" -> [");
            for(int i = 0; i <= order.getProducts().size() -1; i++){
                if(i == order.getProducts().size() -1){
                    sb.append(order.getProducts().get(i).getName());
                }else {
                    sb.append(order.getProducts().get(i).getName()+", ");
                }
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

}
