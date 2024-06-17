package com.devstaff.apis.dto;

import lombok.Data;

@Data
public class CropsPlantResponseDTO extends BaseResponse{
    private int seasonId;
    private int prodId;
    private int fieldId;
    private int farmId;
}
