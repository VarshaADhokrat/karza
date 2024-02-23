package com.gllfl.kycapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAcAdvancedVerificationRequest {
   private String accountNumber;
    private String accountHolderName;
    private String  ifsc;
    private String consent;

    private String nameMatchType;
    private String useCombinedSolution;
    private String allowPartialMatch;

}
