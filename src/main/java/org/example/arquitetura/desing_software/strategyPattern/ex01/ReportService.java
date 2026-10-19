package org.example.arquitetura.desing_software.strategyPattern.ex01;

public class ReportService {
    private final Format format;

    public ReportService(Format format) {
        this.format = format;
    }

    public void generate(String content) {
        format.generate(content);
    }
}
