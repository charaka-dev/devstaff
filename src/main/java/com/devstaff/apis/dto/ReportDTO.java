package com.devstaff.apis.dto;


import java.util.List;

public class ReportDTO {
    private String season;
    private List<ReportFarmDTO> farms;

    // Getters and Setters
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<ReportFarmDTO> getFarms() {
        return farms;
    }

    public void setFarms(List<ReportFarmDTO> farms) {
        this.farms = farms;
    }
}