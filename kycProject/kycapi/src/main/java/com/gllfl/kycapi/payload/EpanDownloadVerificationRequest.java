package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpanDownloadVerificationRequest {
    private  String pan;
    private  String aadhaarNo;
    private  String dob;
    private  String consent;

}
