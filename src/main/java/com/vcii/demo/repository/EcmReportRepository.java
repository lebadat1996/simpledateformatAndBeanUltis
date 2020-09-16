package com.vcii.demo.repository;

import com.vcii.demo.entity.EcmReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcmReportRepository extends JpaRepository<EcmReport, Long> {
}
