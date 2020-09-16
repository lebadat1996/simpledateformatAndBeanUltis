package com.vcii.demo.service;

import com.vcii.demo.entity.EcmReport;
import com.vcii.demo.model.ReportModel;

import java.text.ParseException;
import java.util.List;

public interface ReportService {
    Object saveOrUpdate(ReportModel reportModel) throws ParseException;

    List<EcmReport> models();
}
