package com.gllfl.kycapi.payload;


import com.gllfl.kycapi.model.BankAccountResponseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountVerificationRequest {
    private String consent;
    private String ifsc;
    private String accountNumber;
    private BankAcVerificationClientData clientData;


}
