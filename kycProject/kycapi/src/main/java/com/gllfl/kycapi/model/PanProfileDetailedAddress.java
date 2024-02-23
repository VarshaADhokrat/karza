package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class PanProfileDetailedAddress {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String buildingName;
    private String locality;
    private String streetName;
    private String pinCode;
    private String city;
    private String state;
    private String country;


}
