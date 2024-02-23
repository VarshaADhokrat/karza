package com.gllfl.kycapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GstAuthenticationResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String canFlag;
    @Embedded
    private GstAuthenticationContacted contacted;
    private String ppr;
    private String cmpRt;
    private String rgdt;
    private String tradeNam;
    private String[] nba;
    private String[] mbr;
    @OneToMany(fetch=FetchType.EAGER, mappedBy = "id", cascade=CascadeType.ALL)
    private List<GSTAuthenticationAdadr> adadr;
    @Embedded
    private GstAuthenticationPradr pradr;
    private String stjCd;
    private String lstupdt;
    private String gstin;
    private String ctjCd;
    private String stj;
    private String dty;
    private String cxdt;
    private String ctb;
    private String sts;
    private String  lgnm;
    @Lob
    private String ctj;
    @OneToMany(fetch=FetchType.EAGER, mappedBy = "id", cascade=CascadeType.ALL)
    private List<GstAuthenticationBzgddtls> bzgddtls;
    private String[] bzsdtls;
    private String aggreTurnOver;
    private String mandatedeInvoice;
    private String ntcrbs;
    private String adhrVFlag;
    private String gtiFY;
    private String ekycVFlag;
    private String percentTaxInCash;
    private boolean compDetl;
    private String gti;
    private String aggreTurnOverFY;
    private String percentTaxInCashFY;








}
