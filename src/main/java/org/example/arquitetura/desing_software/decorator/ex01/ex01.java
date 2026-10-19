package org.example.arquitetura.desing_software.decorator.ex01;

public class ex01 {
    public static void main(String[] args) {
        Notifier en = new EmailNotifier();
        Notifier cn = new CompressionNotifier(en);
        Notifier encryption = new EncryptionNotifier(cn);
        Notifier ln = new LoggingNotifier(encryption);

        ln.send("hello");
    }
}
