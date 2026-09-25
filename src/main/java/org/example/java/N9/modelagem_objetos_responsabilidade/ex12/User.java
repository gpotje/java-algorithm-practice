package org.example.java.N9.modelagem_objetos_responsabilidade.ex12;

public class User {
    private String name;
    private String contact;
    private MessageSender preferredSender;

    public User(String name, MessageSender preferredSender, String contact) {
        this.name = name;
        this.preferredSender = preferredSender;
        this.contact = contact;
    }

    public void notifyUser(String message){
        preferredSender.send(this.contact, message);
    }

    //eu fiz uma melhoria aqui
    public void setSender(MessageSender newSender,String contact){
        this.preferredSender = newSender;
        this.contact = contact;
    }
}
