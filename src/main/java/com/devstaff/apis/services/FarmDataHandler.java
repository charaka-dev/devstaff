package com.devstaff.apis.services;

import com.devstaff.apis.dto.*;

public interface FarmDataHandler {
    public BaseResponse updateHarvestData(BaseRequest requestDTO);
    public BaseResponse savePlantedData(BaseRequest requestDTO);
}
