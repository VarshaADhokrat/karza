package com.gllfl.kycapi.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GstNumberAuthenticationVerificationRequest {
    private String consent;
     private boolean additionalData;
    private String gstin;

   private GstNumberAuthenticationClientData clientData;


}
