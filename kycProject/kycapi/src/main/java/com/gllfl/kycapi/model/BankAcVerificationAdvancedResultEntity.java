package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BankAcVerificationAdvancedResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_id")
    private BankAcVerificationAdvancedData data;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "comparisionData_id")
    private BankAcVerificationAdvancedData comparisionData;
}
