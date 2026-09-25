package org.example.java.N9.modelagem_objetos_responsabilidade.ex10;

public class NotEmptyRule implements ValidationRule{
    @Override
    public boolean validate(String input) {
        return !input.isBlank();
    }

    @Override
    public String getErrorMessage() {
        return "O campo não pode ser vazio.";
    }
}
