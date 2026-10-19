package org.example.arquitetura.desing_software.decorator.ex01;

public class EncryptionNotifier implements Notifier{

    private final Notifier notifier;

    public EncryptionNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("Encryption start.....");
        System.out.println("Encryption finish.....");
        notifier.send(message);
    }
}
