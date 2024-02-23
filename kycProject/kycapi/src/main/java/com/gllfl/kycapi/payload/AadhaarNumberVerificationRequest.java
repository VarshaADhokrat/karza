package com.gllfl.kycapi.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  AadhaarNumberVerificationRequest {
    private String aadhaarNo;
    private String consent;
    private String checkValidation;
    private String accessKey;

}
