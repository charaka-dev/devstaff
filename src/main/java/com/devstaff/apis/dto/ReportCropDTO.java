package com.devstaff.apis.dto;
public class ReportCropDTO {
    private String cropType;
    private double expectedYield;
    private double actualYield;

    // Getters and Setters
    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public double getExpectedYield() {
        return expectedYield;
    }

    public void setExpectedYield(double expectedYield) {
        this.expectedYield = expectedYield;
    }

    public double getActualYield() {
        return actualYield;
    }

    public void setActualYield(double actualYield) {
        this.actualYield = actualYield;
    }
}