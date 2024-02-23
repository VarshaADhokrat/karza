package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.EpanDownloadResponseEntity;
import com.gllfl.kycapi.model.EpanDownloadValidateResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpanDownloadValidateRepository extends JpaRepository<EpanDownloadValidateResponseEntity,Long> {
}
