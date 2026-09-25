package org.example.java.N9.modelagem_objetos_responsabilidade.ex12;

public class ex12 {
    public static void main(String[] args) {
        MessageSender sms = new SmsSender();
        MessageSender email = new EmailSender();

        User user1 = new User("JOÂO",sms,"999887766");
        user1.notifyUser("Olá aqui é o joão");

        user1.setSender(email,"teste1@gmail.com");
        user1.notifyUser("Olá aqui é o joão");
    }
}
