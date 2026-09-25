package org.example.java.N9.modelagem_objetos_responsabilidade.ex10;

public class MinLengthRule implements ValidationRule{

    private int minLength;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean validate(String input) {
        return input != null && input.length() >= minLength && !input.isBlank();
    }

    @Override
    public String getErrorMessage() {
        return "O tamanho mínimo é de "+minLength+" caracteres.";
    }
}
