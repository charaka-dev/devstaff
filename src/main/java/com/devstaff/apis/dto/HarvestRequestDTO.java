package com.devstaff.apis.dto;

import lombok.Data;

@Data
public class HarvestRequestDTO extends CorpsBase {
    private double actualYield;
    private long cropsPlantedId;
}