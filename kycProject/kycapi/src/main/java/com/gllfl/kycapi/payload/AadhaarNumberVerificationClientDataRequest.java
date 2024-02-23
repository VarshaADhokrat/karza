package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AadhaarNumberVerificationClientDataRequest {
    private String caseId;
}
