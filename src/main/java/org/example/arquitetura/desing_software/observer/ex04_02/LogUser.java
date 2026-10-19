package org.example.arquitetura.desing_software.observer.ex04_02;

public class LogUser implements UserObserver {
    @Override
    public void onUserCreated(User user) {
        System.out.println("=========== log =========== new user:"+user.getName());
    }
}
