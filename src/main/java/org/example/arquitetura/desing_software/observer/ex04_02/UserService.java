package org.example.arquitetura.desing_software.observer.ex04_02;

import java.util.ArrayList;
import java.util.List;

public class UserService {


    private final List<UserObserver> observers = new ArrayList<>();

    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }


    public void createUser(User u) {
        System.out.println("Order created");

        for (UserObserver observer : observers) {
            observer.onUserCreated(u);
        }
    }
}
