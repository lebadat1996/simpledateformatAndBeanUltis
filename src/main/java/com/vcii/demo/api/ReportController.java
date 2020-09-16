package com.vcii.demo.api;

import com.vcii.demo.entity.EcmReport;
import com.vcii.demo.model.ReportModel;
import com.vcii.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveOrUpdate(@RequestBody ReportModel model) {
        try {
            reportService.saveOrUpdate(model);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping
    public ResponseEntity<List<EcmReport>> getAll() {
        return new ResponseEntity<List<EcmReport>>(reportService.models(), HttpStatus.OK);
    }
}
