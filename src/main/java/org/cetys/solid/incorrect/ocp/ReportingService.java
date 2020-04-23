package org.cetys.solid.incorrect.ocp;

/**
 * Created by edwin on Apr, 2020
 */
public class ReportingService {
    public void generateReportBasedOnType(String reportingType) {
        System.out.println("Generating report based on Type");

        if("CSV".equalsIgnoreCase(reportingType)) {
            generateCSVReport();
        } else if("XML".equalsIgnoreCase(reportingType)) {
            generateXMLReport();
        } else if("Excel".equalsIgnoreCase(reportingType)) {
            generateExcelReport();
        }
    }

    private void generateCSVReport() {
        System.out.println("Generate CSV Report");
    }

    private void generateXMLReport() {
        System.out.println("Generate XML Report");
    }

    private void generateExcelReport() {
        System.out.println("Generate Excel Report");
    }
}
