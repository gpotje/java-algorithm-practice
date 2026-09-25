package org.example.java.N9.modelagem_objetos_responsabilidade.ex09;

public class JsonReader implements DataReader{
    @Override
    public String readData(String filePath) {
        return filePath +  "{\"id\": 1, \"nome\": \"item\", \"valor\": 100}";
    }
}
