package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.PanProfileDetailedResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanProfileDetailedRepository extends JpaRepository<PanProfileDetailedResponseEntity,Long> {
}
