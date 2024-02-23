package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.AadhaarNumberVerificationResponseEntity;
import com.gllfl.kycapi.service.KycService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadhaarNumberVerificationRepository extends JpaRepository<AadhaarNumberVerificationResponseEntity, Long> {



}
