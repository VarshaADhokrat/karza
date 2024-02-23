package com.gllfl.kycapi.service;

import com.gllfl.kycapi.controller.KycController;
import com.gllfl.kycapi.model.*;
import com.gllfl.kycapi.payload.*;
import com.gllfl.kycapi.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class KycService {
    private static final Logger logger = LoggerFactory.getLogger(KycService.class);

    @Autowired
    private WebClient webClient;
    @Autowired
    private PanResponseRepository panResponseRepository;

    @Autowired
    private BankAccountResponseRepository bankAccountResponseRepository;
    @Autowired
    private AadhaarNumberVerificationRepository aadhaarNumberVerificationRepository;
    @Autowired
    private GstNumberAuthenticationRepository gstNumberAuthenticationRepository;
    @Autowired
    private PanStatusCheckRepository panStatusCheckRepository;
    @Autowired
    private PanLinkStatusAnyAadhaarRepository panLinkStatusAnyAadhaarRepository;
    @Autowired

    private PanProfileDetailedRepository panProfileDetailedRepository;
    @Autowired
    private EpanDownloadResponseRepository epanDownloadResponseRepository;
    @Autowired
    private EpanDownloadValidateRepository epanDownloadValidateRepository;
    @Autowired
    private EpanDownloadStatusRepository epanDownloadStatusRepository;

    @Autowired
    private BankAcVerificationAdvancedRepository bankAcVerificationAdvancedRepository;

    public PanResponseEntity verifyPanRequest(PanVerificationRequest panVerificationRequest) {
        logger.info(" KycService::  verifyPanRequest() called");

        System.out.println(panVerificationRequest.getPan());
        PanResponseEntity responseEntity = webClient.post()
                .uri("https://testapi.karza.in/v2/pan")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(panVerificationRequest)
                .retrieve().bodyToMono(PanResponseEntity.class).block();

        System.out.println(responseEntity.getRequestId());
        panResponseRepository.save(responseEntity);
        return responseEntity;
    }

    public BankAccountResponseEntity verifyBankAccountRequest(BankAccountVerificationRequest bankAccountVerificationRequest) {
        logger.info(" KycService:: verifyBankAccountRequest() called");
        System.out.println(bankAccountVerificationRequest.getAccountNumber());
        BankAccountResponseEntity bankAccountResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v2/bankacc")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(bankAccountVerificationRequest)
                .retrieve().bodyToMono(BankAccountResponseEntity.class).block();
        System.out.println(bankAccountResponseEntity.getRequestId());
        bankAccountResponseRepository.save(bankAccountResponseEntity);
        return bankAccountResponseEntity;
    }

    public AadhaarNumberVerificationResponseEntity verifyAadharNumberRequest(AadhaarNumberVerificationRequest aadhaarNumberVerificationRequest) {
        logger.info(" KycService:: verifyAadharNumberRequest() called");
        System.out.println(aadhaarNumberVerificationRequest.getAadhaarNo());
        AadhaarNumberVerificationResponseEntity aadhaarNumberVerificationResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v2/aadhaar-verification")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(aadhaarNumberVerificationRequest)
                .retrieve().bodyToMono(AadhaarNumberVerificationResponseEntity.class).block();
        System.out.println(aadhaarNumberVerificationResponseEntity.getRequestId());
        aadhaarNumberVerificationRepository.save(aadhaarNumberVerificationResponseEntity);
        return aadhaarNumberVerificationResponseEntity;
    }


    public GstAuthenticationResponseEntity verifyGstNumberRequest(GstNumberAuthenticationVerificationRequest gstNumberAuthenticationVerificationRequest) {
        logger.info(" KycService:: verifyGstNumberRequest() called");

        System.out.println(gstNumberAuthenticationVerificationRequest.getGstin() + "Service Called");
        GstAuthenticationResponseEntity gstAuthenticationResponseEntity = webClient.post()
                .uri("https://api.karza.in/gst/uat/v2/gstdetailed?Content-Type=application/json&x-karza-key=W5VUerh954PlBBmg")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(gstNumberAuthenticationVerificationRequest)
                .retrieve().bodyToMono(GstAuthenticationResponseEntity.class).block();
        System.out.println(gstAuthenticationResponseEntity.getRequestId() + " Response get from Karza.");
        gstNumberAuthenticationRepository.save(gstAuthenticationResponseEntity);
        return gstAuthenticationResponseEntity;
    }

    public PanStatusCheckResponseEntity verifyPanStatusCheckRequest(PanStatusCheckVerificationRequest panStatusCheckVerificationRequest) {
        logger.info(" KycService:: verifyPanStatusCheckRequest() called");

        System.out.println(panStatusCheckVerificationRequest.getPan() + "Service Called");
        PanStatusCheckResponseEntity panStatusCheckResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v2/pan-authentication")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(panStatusCheckVerificationRequest)
                .retrieve().bodyToMono(PanStatusCheckResponseEntity.class).block();
        System.out.println(panStatusCheckResponseEntity.getRequestId() + " Response get from Karza.");
        panStatusCheckRepository.save(panStatusCheckResponseEntity);
        return panStatusCheckResponseEntity;

    }

    public PanLinkStatusAnyAadhaarResponseEntity verifyPanLinkCheckRequest(PanLinkStatusAnyAadhaarVerificationRequest panLinkStatusAnyAadhaarVerificationRequest) {
        logger.info(" KycService:: verifyPanLinkCheckRequest() called");
        System.out.println(panLinkStatusAnyAadhaarVerificationRequest.getPan() + "Service Called");
        PanLinkStatusAnyAadhaarResponseEntity panLinkStatusAnyAadhaarResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/pan-link")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(panLinkStatusAnyAadhaarVerificationRequest)
                .retrieve().bodyToMono(PanLinkStatusAnyAadhaarResponseEntity.class).block();
        System.out.println(panLinkStatusAnyAadhaarResponseEntity.getRequestId() + " Response get from Karza.");
        panLinkStatusAnyAadhaarRepository.save(panLinkStatusAnyAadhaarResponseEntity);
        return panLinkStatusAnyAadhaarResponseEntity;

    }

    public PanProfileDetailedResponseEntity verifyPanDetailCheckRequest(PanProfileDetailedVerificationRequest panProfileDetailedVerificationRequest) {
        logger.info(" KycService:: verifyPanDetailCheckRequest() called");

        System.out.println(panProfileDetailedVerificationRequest.getPan() + "  Service Called");
        PanProfileDetailedResponseEntity panProfileDetailedResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/pan-profile")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(panProfileDetailedVerificationRequest)
                .retrieve().bodyToMono(PanProfileDetailedResponseEntity.class).block();
        System.out.println(panProfileDetailedResponseEntity.getRequestId() + " Response get from Karza.");
        panProfileDetailedRepository.save(panProfileDetailedResponseEntity);
        return panProfileDetailedResponseEntity;


    }

    public EpanDownloadResponseEntity verifyePanDownloadRequest(EpanDownloadVerificationRequest epanDownloadVerificationRequest) {
        logger.info(" KycService:: verifyePanDownloadRequest() called");

        System.out.println(epanDownloadVerificationRequest.getPan() + "  Service Called");
        EpanDownloadResponseEntity epanDownloadResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/epan/otp")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(epanDownloadVerificationRequest)
                .retrieve().bodyToMono(EpanDownloadResponseEntity.class).block();
        System.out.println(epanDownloadResponseEntity.getRequestId() + " Response get from Karza.");
        epanDownloadResponseRepository.save(epanDownloadResponseEntity);
        return epanDownloadResponseEntity;

    }

    public EpanDownloadValidateResponseEntity verifyePanDownloadValidate(EpanDownloadValidateVerificationRequest epanDownloadValidateVerificationRequest) {
        logger.info(" KycService:: verifyePanDownloadValidate() called");

        System.out.println(epanDownloadValidateVerificationRequest.getRequestId() + "  Service Called");
        EpanDownloadValidateResponseEntity epanDownloadValidateResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/epan/validate")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(epanDownloadValidateVerificationRequest)
                .retrieve().bodyToMono(EpanDownloadValidateResponseEntity.class).block();
        System.out.println(epanDownloadValidateResponseEntity.getRequestId() + " Response get from Karza.");
        epanDownloadValidateRepository.save(epanDownloadValidateResponseEntity);
        return epanDownloadValidateResponseEntity;
    }

    public EpanDownloadStatusResponseEntity verifyePanDownloadStatus(EpanDownloadStatusVerificationRequest epanDownloadStatusVerificationRequest) {
        logger.info(" KycService:: verifyePanDownloadStatus() called");

        System.out.println(epanDownloadStatusVerificationRequest.getRequestId() + "  Service Called");
        EpanDownloadStatusResponseEntity epanDownloadStatusResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/epan/status")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(epanDownloadStatusVerificationRequest)
                .retrieve().bodyToMono(EpanDownloadStatusResponseEntity.class).block();
        System.out.println(epanDownloadStatusResponseEntity.getRequestId() + " Response get from Karza.");
        epanDownloadStatusRepository.save(epanDownloadStatusResponseEntity);
        return epanDownloadStatusResponseEntity;
    }

    public BankAcVerificationAdvancedResponseEntity verifyBankAcAdvanceRequest(BankAcAdvancedVerificationRequest bankAcAdvancedVerificationRequest) {
        logger.info(" KycService:: verifyBankAcAdvanceRequest() called");

        System.out.println(bankAcAdvancedVerificationRequest.getAccountNumber() + "  Service Called");
        BankAcVerificationAdvancedResponseEntity bankAcverificationAdvancedResponseEntity = webClient.post()
                .uri("https://testapi.karza.in/v3/bankacc-verification")
                .header("clientId", "application/json")
                .header("x-karza-key", "W5VUerh954PlBBmg")
                .bodyValue(bankAcAdvancedVerificationRequest)
                .retrieve().bodyToMono(BankAcVerificationAdvancedResponseEntity.class).block();
        System.out.println(bankAcverificationAdvancedResponseEntity.getStatusCode() + " Response get from Karza.");
        bankAcVerificationAdvancedRepository.save(bankAcverificationAdvancedResponseEntity);
        return bankAcverificationAdvancedResponseEntity;
    }
}
