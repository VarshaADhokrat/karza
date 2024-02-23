package com.gllfl.kycapi.repository;

import com.gllfl.kycapi.model.GstAuthenticationResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GstNumberAuthenticationRepository extends JpaRepository<GstAuthenticationResponseEntity,Long> {
}
