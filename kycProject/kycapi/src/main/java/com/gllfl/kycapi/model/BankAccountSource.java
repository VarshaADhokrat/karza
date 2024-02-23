package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statusAsPerSource;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_id")
    private BankAccountStatusData data;
    private String isValid;
}
