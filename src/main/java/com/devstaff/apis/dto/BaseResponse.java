package com.devstaff.apis.dto;

import lombok.Data;

@Data
public class BaseResponse<T> {
    String responseStatus;
    String datetime;
    String message;
    T responseObject;

}
