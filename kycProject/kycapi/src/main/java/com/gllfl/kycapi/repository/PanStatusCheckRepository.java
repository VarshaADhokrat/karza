package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.PanStatusCheckResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanStatusCheckRepository extends JpaRepository<PanStatusCheckResponseEntity, Long> {
}
