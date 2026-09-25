package org.example.java.N9.modelagem_objetos_responsabilidade.ex08;

public class SmsNotification extends Notification{

    public SmsNotification(String recipient) {
        super(recipient);
    }

    @Override
    public boolean sendContent(String message) {
        System.out.println("[SMS] Enviando para " + recipient + ": " + message);
        return true;
    }
}
