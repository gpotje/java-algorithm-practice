package org.example.arquitetura.desing_software.strategyPattern.ex01;

public class CsvFormat implements Format{
    @Override
    public void generate(String content) {
        System.out.println("========== CsvFormat ===============");
    }
}
