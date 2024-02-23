package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanLinkStatusAnyAadhaarVerificationRequest {
    private String pan;
    private String consent;

}
