package org.example.arquitetura.desing_software.observer.ex04_02;

public class EmailUser implements UserObserver {
    @Override
    public void onUserCreated(User user) {
        System.out.println("Welcome new user:"+user.getName());
    }
}
