package org.example.java.N9.modelagem_objetos_responsabilidade.ex04;

public class UserProfile {
    private String username;
    private int age;

    public UserProfile(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public boolean canWatch(MediaContent content){
        return content.getRating().isAllowed(this.age);
    }
}
