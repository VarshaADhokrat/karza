package com.gllfl.kycapi.model;

import com.gllfl.kycapi.model.embedable.ClientDataAadhaarNumberVerification;
import com.gllfl.kycapi.model.embedable.PanClientData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer statusCode;
    private String requestId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private PanResultEntity result;

    @Embedded
    private PanClientData panClientData;

}
