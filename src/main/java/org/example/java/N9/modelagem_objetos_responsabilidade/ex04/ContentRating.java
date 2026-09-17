package org.example.java.N9.modelagem_objetos_responsabilidade.ex04;

public enum ContentRating {
    MATURE(18),
    TEEN(12),
    GENERAL(0);

    private final int limit;

    ContentRating(int limit) {
        this.limit = limit;
    }

    public boolean isAllowed(int age) {
        return age >= this.limit;
    }

}
