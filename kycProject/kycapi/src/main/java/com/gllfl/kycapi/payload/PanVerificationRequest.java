package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanVerificationRequest {
    private String consent;
    private String pan;
    private PanClientData clientData;
}
