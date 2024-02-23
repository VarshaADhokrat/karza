package com.gllfl.kycapi.controller;


import com.gllfl.kycapi.payload.*;
import com.gllfl.kycapi.service.KycService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/{v1}")
public class KycController {
    private static final Logger logger = LoggerFactory.getLogger(KycController.class);
    @Autowired
    private WebClient webClient;
    @Autowired
    private KycService kycService;



        @PostMapping("/pan-verify")
        public ResponseEntity<?> savePanEntity (@RequestBody PanVerificationRequest panVerificationRequest){
            logger.info(" KycController:: /pan-verify Api Called ");
            System.out.println(panVerificationRequest.getPan());
            return new ResponseEntity<>(kycService.verifyPanRequest(panVerificationRequest), HttpStatus.OK);
        }
        @PostMapping("/bankaccount-verify")
        public ResponseEntity<?> saveEntity (@RequestBody BankAccountVerificationRequest bankAccountVerificationRequest)
        {
            logger.info(" KycController:: /bankaccount-verify Api Called ");

            System.out.println(bankAccountVerificationRequest.getAccountNumber());
            return new ResponseEntity<>(kycService.verifyBankAccountRequest(bankAccountVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/aadhar")
        public ResponseEntity<?> saveAadharEntity(@RequestBody AadhaarNumberVerificationRequest
        aadhaarNumberVerificationRequest){
            logger.info(" KycController:: /aadhar-verify Api Called ");
            System.out.println(aadhaarNumberVerificationRequest.getAadhaarNo());
            return new ResponseEntity<>(kycService.verifyAadharNumberRequest(aadhaarNumberVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/gstnumber-verify")
        public ResponseEntity<?> saveGstEntity (@RequestBody GstNumberAuthenticationVerificationRequest
        gstNumberAuthenticationVerificationRequest){
            logger.info(" KycController:: /gstnumber-verify Api Called ");

            System.out.println(gstNumberAuthenticationVerificationRequest.getGstin() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyGstNumberRequest(gstNumberAuthenticationVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/panstatus-verify")
        public ResponseEntity<?> savePanStatusCheckEntity (@RequestBody PanStatusCheckVerificationRequest
        panStatusCheckVerificationRequest){
            logger.info(" KycController:: /panstatus-verify Api Called ");
            System.out.println(panStatusCheckVerificationRequest.getPan() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyPanStatusCheckRequest(panStatusCheckVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/pan-link-any-aadhaar")
        public ResponseEntity<?> savePanLinkAnyAadhaarEntity (@RequestBody PanLinkStatusAnyAadhaarVerificationRequest
        panLinkStatusAnyAadhaarVerificationRequest){
            logger.info(" KycController:: /pan-link-any-aadhaar-verify Api Called ");
            System.out.println(panLinkStatusAnyAadhaarVerificationRequest.getPan() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyPanLinkCheckRequest(panLinkStatusAnyAadhaarVerificationRequest), HttpStatus.OK);

        }

        @PostMapping("/pan-profile-detailed")
        public ResponseEntity<?> savePanProfileDetailed (@RequestBody PanProfileDetailedVerificationRequest
        panProfileDetailedVerificationRequest){
            logger.info(" KycController:: /pan-profile-detailed-verify Api Called ");
            System.out.println(panProfileDetailedVerificationRequest.getPan() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyPanDetailCheckRequest(panProfileDetailedVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/epan-download")
        public ResponseEntity<?> savePanDownloadDetailed (@RequestBody EpanDownloadVerificationRequest
        epanDownloadVerificationRequest){
            logger.info(" KycController:: /epan-downloadverify Api Called ");
            System.out.println(epanDownloadVerificationRequest.getPan() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyePanDownloadRequest(epanDownloadVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/epan-validate-download")
        public ResponseEntity<?> savePanDownloadValidate (@RequestBody EpanDownloadValidateVerificationRequest
        epanDownloadValidateVerificationRequest)
        {
            logger.info("KycController ::/epan-validate-downloadapi called : ");
            System.out.println(epanDownloadValidateVerificationRequest.getRequestId() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyePanDownloadValidate(epanDownloadValidateVerificationRequest), HttpStatus.OK);
        }

        @PostMapping("/epan-status-download")
        public ResponseEntity<?> savePanDownloadStatus (@RequestBody EpanDownloadStatusVerificationRequest
        epanDownloadStatusVerificationRequest){
            logger.info(" KycController:: /epan-status- Api Called ");
            System.out.println(epanDownloadStatusVerificationRequest.getRequestId() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyePanDownloadStatus(epanDownloadStatusVerificationRequest), HttpStatus.OK);

        }

        @PostMapping("/bankac-advance-verify")
        public ResponseEntity<?> saveBankAdvanceVerify(@RequestBody BankAcAdvancedVerificationRequest bankAcAdvancedVerificationRequest)
        {
            logger.info(" KycController:: /bankac-advance-verify- Api Called ");
            System.out.println(bankAcAdvancedVerificationRequest.getAccountNumber() + "Controller called.");
            return new ResponseEntity<>(kycService.verifyBankAcAdvanceRequest(bankAcAdvancedVerificationRequest), HttpStatus.OK);
        }
    }
