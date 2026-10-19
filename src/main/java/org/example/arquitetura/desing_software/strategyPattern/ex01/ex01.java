package org.example.arquitetura.desing_software.strategyPattern.ex01;

import java.text.Normalizer;

public class ex01 {
    public static void main(String[] args) {
        Format pdf = new PdfFormat();
        Format csv = new CsvFormat();

        ReportService servicePDF = new ReportService(pdf);
        servicePDF.generate("TESTE PDF");

        ReportService serviceCSV = new ReportService(csv);
        serviceCSV.generate("TESTE csv");
    }
}
