package com.gllfl.kycapi.model.embedable;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDataAadhaarNumberVerification {
    private String caseId;
}
