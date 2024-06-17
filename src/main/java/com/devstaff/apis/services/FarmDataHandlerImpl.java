package com.devstaff.apis.services;

import com.devstaff.apis.dto.*;
import com.devstaff.apis.entity.HarvestSubmission;
import com.devstaff.apis.mappers.CropPlantMapper;
import com.devstaff.apis.repository.FarmDataSubmissionRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Handle data manipulation and constructing of farm data
 */

@Service
public class FarmDataHandlerImpl implements FarmDataHandler{


    @Autowired
    ModelMapper modelMapper;
    @Autowired
    FarmDataSubmissionRepo submissionRepo;

    public BaseResponse updateHarvestData(BaseRequest requestDTO) {

        BaseResponse<HarvestResponseDTO> response = new BaseResponse();
        List<HarvestResponseDTO> list = new ArrayList<HarvestResponseDTO>();

        Arrays.stream(requestDTO.data).forEach(record ->{
            HarvestRequestDTO harvestRequestDTO = (HarvestRequestDTO) record;
            String subId =harvestRequestDTO.getCropsPlantedId();
            Optional<HarvestSubmission> submittedObj = submissionRepo.findBySubmitId(subId);
            if (submittedObj.isPresent()) {
                HarvestSubmission submission = submittedObj.get();
                submission.setActualYield(harvestRequestDTO.getActualYield()); // Update the actual amount
                // Save the updated entity
                submissionRepo.saveAndFlush(submission);
                HarvestResponseDTO destinationDTO = modelMapper.map(submittedObj, HarvestResponseDTO.class);
                list.add(destinationDTO);
            }
        });
        response.setResponseObject(list);
        response.setResponseMessage( "Actual Yield are updated for Submitted IDs ");
        return response;
    }

    @Override
    public BaseResponse savePlantedData(BaseRequest requestDTO) {

        BaseResponse<CropsPlantResponseDTO> response = new BaseResponse();
        List<CropsPlantResponseDTO> list = new ArrayList<CropsPlantResponseDTO>();
        Arrays.stream(requestDTO.data).forEach(record ->{
            UUID uuid = UUID.randomUUID();
            submissionRepo.saveAndFlush(CropPlantMapper.toEntity((CropsPlantRequestDTO) record));
            CropsPlantResponseDTO destinationDTO = modelMapper.map((CropsPlantRequestDTO) record, CropsPlantResponseDTO.class);
            destinationDTO.setSubmittedId(uuid.toString());
            list.add(destinationDTO);

        });
        response.setResponseObject(list);
        response.setDatetime(new Date());
        response.setResponseMessage("Planted Data Saved");
        return response;
    }
}
