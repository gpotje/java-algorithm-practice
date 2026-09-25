package org.example.java.N9.modelagem_objetos_responsabilidade.ex09;

public class ex09 {
    public static void main(String[] args) {
        DataReader json = new JsonReader();
        DataReader csv = new CsvReader();

        DataProcessor ap = new DataProcessor();
        System.out.println(ap.process(json,"c:/teste/json/"));

        System.out.println(ap.process(csv,"c:/teste/csv/"));
    }
}
