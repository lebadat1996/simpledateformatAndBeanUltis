package com.vcii.demo.service;

import com.vcii.demo.entity.EcmReport;
import com.vcii.demo.model.ReportModel;
import com.vcii.demo.repository.EcmReportRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    private static final Logger logger = LogManager.getLogger(ReportServiceImpl.class);

    @Autowired
    EcmReportRepository repository;

    @Override
    public Object saveOrUpdate(ReportModel model) throws ParseException {
        if (logger.isDebugEnabled()) {
            logger.debug("Logging in saveOrUpdate");
            logger.debug("Parameter input: {}", model);
        }
        EcmReport report = new EcmReport();
        BeanUtils.copyProperties(model, report, "timeAction");
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date date = new Date();
//        date = formatter.parse(model.getTimeAction());
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(model.getTimeAction());
        report.setTimeAction(date);
        if (logger.isDebugEnabled()) {
            logger.debug("Object ID : {}", report.getId());
        }
        return repository.save(report);
    }

    @Override
    public List<EcmReport> models() {
        return repository.findAll();
    }
}
