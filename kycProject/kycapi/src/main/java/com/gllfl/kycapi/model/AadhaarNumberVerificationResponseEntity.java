package com.gllfl.kycapi.model;

import com.gllfl.kycapi.model.embedable.ClientDataAadhaarNumberVerification;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AadhaarNumberVerificationResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private AadhaarNumberVerificationResultEntity result;
    private String requestId;
    private Integer statusCode;
    @Embedded
    private ClientDataAadhaarNumberVerification clientData;


}
