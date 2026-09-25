package org.example.java.N9.modelagem_objetos_responsabilidade.ex12;

public class SmsSender implements MessageSender{
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("[SMS] Para " + recipient + ": " + message);
        return true;
    }
}
