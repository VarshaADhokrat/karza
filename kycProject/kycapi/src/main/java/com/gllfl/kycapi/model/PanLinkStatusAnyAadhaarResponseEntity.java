package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanLinkStatusAnyAadhaarResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;
    private Integer statusCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private PanResultEntity result;
}
