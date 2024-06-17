package com.devstaff.apis.mappers;


import com.devstaff.apis.dto.CropsPlantRequestDTO;
import com.devstaff.apis.dto.HarvestRequestDTO;
import com.devstaff.apis.entity.HarvestSubmission;

public class HarvestMapper {
    public static HarvestSubmission toEntity(HarvestRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        // Init Entity
        HarvestSubmission cropPlant = new HarvestSubmission();
        cropPlant.setSeasonId(dto.getSeasonId());
        cropPlant.setProdId(dto.getProdId());
        cropPlant.setFieldId(dto.getFieldId());
        cropPlant.setFarmId(dto.getFarmId());
        cropPlant.setExpectedYield((dto.getActualYield()));
        return cropPlant;
    }
}