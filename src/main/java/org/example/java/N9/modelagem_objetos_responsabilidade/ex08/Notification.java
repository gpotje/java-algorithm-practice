package org.example.java.N9.modelagem_objetos_responsabilidade.ex08;

public abstract class Notification {

    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public  abstract boolean sendContent(String message);

    public boolean dispatch(String message){
        boolean isValid = message != null && !message.isBlank()
                && recipient != null && !recipient.isBlank();

        if(isValid){
            return sendContent(message);
        }

        return  false;
    }

}
