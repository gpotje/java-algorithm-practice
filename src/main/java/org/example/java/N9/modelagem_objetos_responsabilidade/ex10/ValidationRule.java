package org.example.java.N9.modelagem_objetos_responsabilidade.ex10;

public interface ValidationRule {
    boolean validate(String input);
    String getErrorMessage();
}
