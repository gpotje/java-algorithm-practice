package org.example.java.N9.modelagem_objetos_responsabilidade.ex10;

import java.util.ArrayList;
import java.util.List;

public class ex10 {
    public static void main(String[] args) {
        ValidationRule mlr = new MinLengthRule(3);
        ValidationRule ner = new NotEmptyRule();

        ValidatorEngine engine = new ValidatorEngine();
        engine.addRule(mlr);
        engine.addRule(ner);


        System.out.println(engine.validateAll("TESTE"));
    }
}
