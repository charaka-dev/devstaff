package com.devstaff.apis.dto;


import lombok.Data;

@Data
public class CropsPlantRequestDTO extends CorpsBase{
    private double plantingArea;
    private double expectedYield;
    private String submitID;

}
