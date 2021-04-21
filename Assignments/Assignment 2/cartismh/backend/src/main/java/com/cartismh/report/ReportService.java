package com.cartismh.report;

public interface ReportService {
    final String HEADER = "Id,Title,Author,Genre,Price";
    String export();

    ReportType getType();
}
