package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpanDownloadResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private EpanDownloadResultEntity result;
    private Integer statusCode;

}
