package org.example.arquitetura.desing_software.observer.ex04_02;

public class ExU01 {
    public static void main(String[] args) {

        User u1 = new User("Gabriel",35);
        UserService service = new UserService();
        service.addObserver(new EmailUser());
        service.addObserver(new LogUser());

        service.createUser(u1);
    }
}
