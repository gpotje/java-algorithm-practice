package org.example.java.N9.modelagem_objetos_responsabilidade.ex09;

public class CsvReader implements DataReader{
    @Override
    public String readData(String filePath) {
        return filePath + "id, nome, valor \n 1, item, 100";
    }
}
