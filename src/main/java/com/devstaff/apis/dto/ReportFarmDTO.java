package com.devstaff.apis.dto;


import java.util.List;

public class ReportFarmDTO {
    private String farmName;
    private List<ReportCropDTO> crops;

    // Getters and Setters
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public List<ReportCropDTO> getCrops() {
        return crops;
    }

    public void setCrops(List<ReportCropDTO> crops) {
        this.crops = crops;
    }
}