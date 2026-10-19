package org.example.arquitetura.desing_software.decorator.ex01;

public class CompressionNotifier implements Notifier{

    private final Notifier notifier;

    public CompressionNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("CompressionNotifier");
        notifier.send(message);
    }
}
