package org.example.java.N9.modelagem_objetos_responsabilidade.ex08;

import java.util.List;

public class NotificationService {

    public void sendBulk(List<Notification> notifications, String message){
        for(Notification n:notifications){
            System.out.println(n.dispatch(message));
        }
    }
}
