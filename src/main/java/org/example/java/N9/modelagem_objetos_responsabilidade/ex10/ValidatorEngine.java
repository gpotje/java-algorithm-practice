package org.example.java.N9.modelagem_objetos_responsabilidade.ex10;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEngine {
    private List<ValidationRule> rules;

    public ValidatorEngine() {
        this.rules = new ArrayList<>();
    }

    public void addRule(ValidationRule rule){
        rules.add(rule);
    }

    public boolean validateAll(String input) {
        for (ValidationRule rule : rules) {
            if (!rule.validate(input)) {
                System.out.println(rule.getErrorMessage());
                return false;
            }
        }
        return true;
    }
}
