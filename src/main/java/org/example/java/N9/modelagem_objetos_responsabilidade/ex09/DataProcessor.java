package org.example.java.N9.modelagem_objetos_responsabilidade.ex09;

import java.util.Locale;

public class DataProcessor {
    public String process(DataReader r, String fp){
        return r.readData(fp).toUpperCase();
    }
}
