package com.vcii.demo.model;

import lombok.Data;

@Data
public class EcmEntity {
    public String id;
    public String codeCif;
    public String cusName;
    public String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeCif() {
        return codeCif;
    }

    public void setCodeCif(String codeCif) {
        this.codeCif = codeCif;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EcmEntity{" +
                "id='" + id + '\'' +
                ", codeCif='" + codeCif + '\'' +
                ", cusName='" + cusName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
