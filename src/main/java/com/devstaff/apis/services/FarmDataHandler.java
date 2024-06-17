package com.devstaff.apis.services;

import com.devstaff.apis.dto.*;

public interface FarmDataHandler {
    public BaseResponse updateHarvestData(HarvestRequestDTO requestDTO);
    public BaseResponse savePlantedData(CropsPlantRequestDTO requestDTO);
}
