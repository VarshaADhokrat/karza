package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.EpanDownloadStatusResponseEntity;
import com.gllfl.kycapi.model.EpanDownloadValidateResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpanDownloadStatusRepository extends JpaRepository<EpanDownloadStatusResponseEntity,Long> {
}
