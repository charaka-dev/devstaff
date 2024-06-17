package com.devstaff.apis.services;

import com.devstaff.apis.dto.*;
import com.devstaff.apis.entity.HarvestSubmission;
import com.devstaff.apis.mappers.CropPlantMapper;
import com.devstaff.apis.repository.FarmDataSubmissionRepo;
import jakarta.persistence.Entity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Handle data manipulation and constructing of farm data
 */

@Service
public class FarmDataHandlerImpl implements FarmDataHandler{


    @Autowired
    ModelMapper modelMapper;
    @Autowired
    FarmDataSubmissionRepo submissionRepo;
    @Override
    public BaseResponse<HarvestResponseDTO> updateHarvestData(HarvestRequestDTO requestDTO) {
        Optional<HarvestSubmission> submittedObj = submissionRepo.findById(requestDTO.getCropsPlantedId());
        if (submittedObj.isPresent()) {
            HarvestSubmission submission = submittedObj.get();
            submission.setActualYield(requestDTO.getActualYield()); // Update the actual amount
            // Save the updated entity
            submissionRepo.saveAndFlush(submission);
        }
        BaseResponse<HarvestResponseDTO> response = new BaseResponse();
        HarvestResponseDTO destinationDTO = modelMapper.map(requestDTO, HarvestResponseDTO.class);
        response.setResponseObject(destinationDTO);
        response.setResponseStatus( "Actual Yield is Saved");
        return response;
    }

    @Override
    public BaseResponse savePlantedData(CropsPlantRequestDTO requestDTO) {
        HarvestSubmission savedId = submissionRepo.saveAndFlush(CropPlantMapper.toEntity(requestDTO));
        BaseResponse<CropsPlantResponseDTO> response = new BaseResponse();
        CropsPlantResponseDTO destinationDTO = modelMapper.map(requestDTO, CropsPlantResponseDTO.class);
        response.setResponseObject(destinationDTO);
        response.setResponseStatus( "Planted Data Saved");
        return response;
    }
}
