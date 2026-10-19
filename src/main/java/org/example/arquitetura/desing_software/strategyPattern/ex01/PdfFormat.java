package org.example.arquitetura.desing_software.strategyPattern.ex01;

public class PdfFormat implements Format{
    @Override
    public void generate(String content) {
        System.out.println("========== PdfFormat ===============");
    }
}
