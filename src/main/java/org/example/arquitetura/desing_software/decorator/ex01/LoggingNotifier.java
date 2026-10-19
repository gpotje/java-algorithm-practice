package org.example.arquitetura.desing_software.decorator.ex01;

public class LoggingNotifier implements Notifier{

    private final Notifier notifier;

    public LoggingNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("Log: sending notification");
        notifier.send(message);
    }
}
