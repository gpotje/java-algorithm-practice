package org.example.java.N9.modelagem_objetos_responsabilidade.ex08;

public class EmailNotification extends Notification{

    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    public boolean sendContent(String message) {
        System.out.println("[EMAIL] Enviando para " + recipient + ": " + message);
        return true;
    }
}
