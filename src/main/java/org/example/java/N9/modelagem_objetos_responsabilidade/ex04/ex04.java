package org.example.java.N9.modelagem_objetos_responsabilidade.ex04;

public class ex04 {
    public static void main(String[] args) {
        MediaContent mc = new MediaContent("spider man",ContentRating.MATURE);
        UserProfile up = new UserProfile("Gabriel",1);
        System.out.println(up.canWatch(mc));
    }
}
