package com.devstaff.apis.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BaseResponse<T> {
    Date datetime;
    String responseMessage;
    List<T> responseObject;

}
