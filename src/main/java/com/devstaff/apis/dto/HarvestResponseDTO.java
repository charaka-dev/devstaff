package com.devstaff.apis.dto;

import lombok.Data;

@Data
public class HarvestResponseDTO extends BaseResponse {
    private Long id;
    private String cropType;
    private double actualYield;
    private Long farmId;
    private Long seasonId;
}
