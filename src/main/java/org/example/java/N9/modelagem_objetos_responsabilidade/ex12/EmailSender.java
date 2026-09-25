package org.example.java.N9.modelagem_objetos_responsabilidade.ex12;

public class EmailSender implements MessageSender{
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("[EMAIL] Para " + recipient + ": " + message);
        return true;
    }
}
