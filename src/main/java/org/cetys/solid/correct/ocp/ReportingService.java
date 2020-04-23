package org.cetys.solid.correct.ocp;

/**
 * Created by edwin on Apr, 2020
 */
public class ReportingService {
    public void generateReportBasedOnStrategy(ReportingStrategy strategy) {
        System.out.println("Generating report based on Strategy");
        strategy.generateReport();
    }
}
