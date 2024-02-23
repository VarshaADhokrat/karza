package com.gllfl.kycapi.payload;

import lombok.Data;

@Data
public class PanStatusCheckVerificationRequest {
    private String pan;
    private String name;
    private String dob;
    private String consent;

}
