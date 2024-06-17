package com.devstaff.apis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "harvest_submission_tbl")
public class HarvestSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int seasonId;
    private int prodId;
    private int fieldId;
    private int farmId;
    private double plantingArea;
    private double expectedYield;
    private double actualYield;

    public double getPlantingArea() {
        return plantingArea;
    }

    public void setPlantingArea(double plantingArea) {
        this.plantingArea = plantingArea;
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

    @Temporal(TemporalType.DATE)
    private Date createdAt;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}