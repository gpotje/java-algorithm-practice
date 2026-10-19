package org.example.arquitetura.desing_software.decorator.ex01;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
