package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.EpanDownloadResponseEntity;
import com.gllfl.kycapi.model.GstAuthenticationResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpanDownloadResponseRepository extends JpaRepository<EpanDownloadResponseEntity,Long> {
}
