package com.devstaff.apis.mappers;


import com.devstaff.apis.dto.CropsPlantRequestDTO;
import com.devstaff.apis.entity.HarvestSubmission;

public class CropPlantMapper {
    public static HarvestSubmission toEntity(CropsPlantRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        // Init Entity
        HarvestSubmission cropPlant = new HarvestSubmission();
        cropPlant.setSeasonId(dto.getSeasonId());
        cropPlant.setProdId(dto.getProdId());
        cropPlant.setFieldId(dto.getFieldId());
        cropPlant.setFarmId(dto.getFarmId());
        cropPlant.setPlantingArea(dto.getPlantingArea());
        cropPlant.setExpectedYield(dto.getExpectedYield());
        return cropPlant;
    }
}