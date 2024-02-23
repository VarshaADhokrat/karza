package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GstAuthenticationContacted {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
   private String email;
    private String mobNum;
    private String name;
}
