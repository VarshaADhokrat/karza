package com.gllfl.kycapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountStatusData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  accountNumber;
    private String  ifsc;
    private String accountName;
    private String bankResponse;
    private String bankTxnStatus;
    private String bankRRN;
    private String statusCode;



}
