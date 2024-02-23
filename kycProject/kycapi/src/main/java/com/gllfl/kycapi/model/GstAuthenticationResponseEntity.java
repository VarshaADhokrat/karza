package com.gllfl.kycapi.model;

import com.gllfl.kycapi.model.embedable.GstAuthenticationClientData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GstAuthenticationResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String requestId;
    private Integer statusCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_id")
    private GstAuthenticationResultEntity result;

    @Embedded
    private GstAuthenticationClientData clientData;

}
