package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpanDownloadValidateResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private EpanDownloadValidateResultEntity result;
    private Integer statusCode;
}
