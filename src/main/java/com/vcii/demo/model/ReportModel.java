package com.vcii.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportModel {
    private long id;

    private String caseId;

    private String username;

    private String roleName;

    private String action;

    private String timeAction;

    private String commentValue;

    private String taskComment;

    private String workClassName;

    private String stepName;

    private String exchangeType;

    private String posSend;

    private String posReceive;

    private String levelDifficult;

    private String priority;

    private String processCode;

    private String processName;

    private String transactionCode;

    private String transactionName;

    private String posSendName;

    private String posReceiveName;
}
