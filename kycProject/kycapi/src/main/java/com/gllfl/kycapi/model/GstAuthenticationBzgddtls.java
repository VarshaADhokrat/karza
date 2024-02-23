package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GstAuthenticationBzgddtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private  String gdes;
    @Lob
    private  String hsncd;
    @Lob
    private  String subIndustry;
    @Lob
    private  String industry;
}
