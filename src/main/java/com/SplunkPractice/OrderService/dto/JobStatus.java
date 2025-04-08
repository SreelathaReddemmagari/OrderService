package com.SplunkPractice.OrderService.dto;

public enum JobStatus {
    SUCCESS("Success"),
    FAILED("Failed");

    private final String name;

    JobStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
