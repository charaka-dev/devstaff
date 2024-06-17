package com.devstaff.apis.controllers;

import com.devstaff.apis.dto.BaseRequest;
import com.devstaff.apis.dto.BaseResponse;
import com.devstaff.apis.dto.CropsPlantRequestDTO;
import com.devstaff.apis.dto.HarvestRequestDTO;
import com.devstaff.apis.services.FarmDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/crops/")
public class HarvestStatistics {

    @Autowired
    FarmDataHandler farmDataHandler;

    /**
     * Save initial plantation and expected yields
     * @param requestDTO
     * @return
     */
    @RequestMapping(path = "/planted" , method = RequestMethod.POST)
    public ResponseEntity submitPlanted(@RequestBody BaseRequest<CropsPlantRequestDTO> requestDTO){
        BaseResponse response = farmDataHandler.savePlantedData(requestDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    /**
     * Updte actula harvest
     * @return
     */
    @RequestMapping(path = "/harvested" , method = RequestMethod.POST)
    public ResponseEntity submitHarvested(@RequestBody BaseRequest<HarvestRequestDTO> requestDTO){
        BaseResponse response = farmDataHandler.updateHarvestData(requestDTO);
        if (! response.getResponseMessage().startsWith("Submission ID is incorrect")){
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
