package com.vcii.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "ECM_TRADE_TRANS")
@Data
public class EcmReport {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "CASEID")
    private String caseId;

    private String username;

    @Column(name = "ROLENAME")
    private String roleName;

    private String action;

    @Column(name = "TIMEACTION")
    private Date timeAction;

    @Column(name = "COMMENTVALUE")
    private String commentValue;

    @Column(name = "TASKCOMMENT")
    private String taskComment;

    @Column(name = "WORKCLASSNAME")
    private String workClassName;

    @Column(name = "STEPNAME")
    private String stepName;

    @Column(name = "POSSEND")
    private String posSend;

    @Column(name = "POSRECEIVE")
    private String posReceive;

    @Column(name = "LEVELDIFFICULT")
    private String levelDifficult;

    private String priority;

    @Column(name = "PROCESSCODE")
    private String processCode;

    @Column(name = "PROCESSNAME")
    private String processName;

    @Column(name = "TRANSACTIONCODE")
    private String transactionCode;

    @Column(name = "TRANSACTIONNAME")
    private String transactionName;

    @Column(name = "POSSEND_NAME")
    private String posSendName;

    @Column(name = "POSRECEIVE_NAME")
    private String posReceiveName;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCaseId() {
        return this.caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getTimeAction() {
        return this.timeAction;
    }

    public void setTimeAction(Date timeAction) {
        this.timeAction = timeAction;
    }

    public String getCommentValue() {
        return this.commentValue;
    }

    public void setCommentValue(String commentValue) {
        this.commentValue = commentValue;
    }

    public String getTaskComment() {
        return this.taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    public String getWorkClassName() {
        return this.workClassName;
    }

    public void setWorkClassName(String workClassName) {
        this.workClassName = workClassName;
    }

    public String getStepName() {
        return this.stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getPosSend() {
        return this.posSend;
    }

    public void setPosSend(String posSend) {
        this.posSend = posSend;
    }

    public String getPosReceive() {
        return this.posReceive;
    }

    public void setPosReceive(String posReceive) {
        this.posReceive = posReceive;
    }

    public String getLevelDifficult() {
        return this.levelDifficult;
    }

    public void setLevelDifficult(String levelDifficult) {
        this.levelDifficult = levelDifficult;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProcessCode() {
        return this.processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getProcessName() {
        return this.processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getTransactionCode() {
        return this.transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionName() {
        return this.transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getPosSendName() {
        return this.posSendName;
    }

    public void setPosSendName(String posSendName) {
        this.posSendName = posSendName;
    }

    public String getPosReceiveName() {
        return this.posReceiveName;
    }

    public void setPosReceiveName(String posReceiveName) {
        this.posReceiveName = posReceiveName;
    }
}
