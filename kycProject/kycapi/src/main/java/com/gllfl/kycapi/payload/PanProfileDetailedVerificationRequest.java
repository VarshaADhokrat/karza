package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanProfileDetailedVerificationRequest {
    private String pan;
    private String aadhaarLastFour;
    private Date dob;
    private String name;
    private String address;
    private String getContactDetails;
    private String PANStatus;
    private String isSalaried;
    private String isDirector;
    private String isSoleProp;
    private String consent;




}
