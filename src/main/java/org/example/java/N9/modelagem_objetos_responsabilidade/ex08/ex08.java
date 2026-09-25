package org.example.java.N9.modelagem_objetos_responsabilidade.ex08;

import java.util.ArrayList;
import java.util.List;

public class ex08 {
    public static void main(String[] args) {
        Notification en = new EmailNotification("jose@gmail.com");
        Notification sms =  new SmsNotification("119999-9999");

        List<Notification> listEmailNotification =new ArrayList<>();
        listEmailNotification.add(en);
        listEmailNotification.add(en);
        listEmailNotification.add(en);
        listEmailNotification.add(en);
        listEmailNotification.add(en);


        NotificationService service = new NotificationService();
        service.sendBulk(listEmailNotification,"teste");


    }
}
