package com.gllfl.kycapi.model;


import com.gllfl.kycapi.model.embedable.BankAccountClientData;
import com.gllfl.kycapi.model.embedable.PanClientData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer statusCode;
    private String requestId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private BankAccountResultEntity result;
    @Embedded
    private BankAccountClientData bankAccountClientData;
}
