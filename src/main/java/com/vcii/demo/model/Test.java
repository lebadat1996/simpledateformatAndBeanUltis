package com.vcii.demo.model;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) {
        String a = "[{\"id\":[1,2]," +
                "\"codeCif\":[\"0100009251\"]," +
                "\"cusName\":[\"NGUYEN VAN A\"]," +
                "\"description\":[\"Mở giao dịch\"]}]";
        Gson g = new Gson();
        ModelObj[] modelObj = g.fromJson(a, ModelObj[].class);
        for (int i = 0; i < modelObj.length; i++) {
            EcmEntity ecmEntity = new EcmEntity();
            ecmEntity.setId(modelObj[i].id[i]);
            ecmEntity.setCodeCif(modelObj[i].codeCif[i]);
            System.out.println(ecmEntity.getId());
            System.out.println(ecmEntity);
        }

        String b = "{\"lstModelObj\":[{\"id\":[1],\"codeCif\":[\"0100009251\"],\"cusName\":[\"NGUYEN VAN A\"],\"description\":[\"Mở giao dịch\"]}]}";
        LstModel modelObj1 = g.fromJson(b, LstModel.class);
        for (int i = 0; i < modelObj1.getLstModelObj().length; i++) {
            EcmEntity ecmEntity = new EcmEntity();
            ecmEntity.setId(modelObj1.getLstModelObj()[i].id[i]);
            ecmEntity.setCodeCif(modelObj1.getLstModelObj()[i].cusName[i]);
            ecmEntity.setDescription(modelObj1.getLstModelObj()[i].description[i]);
            ecmEntity.setCusName(modelObj1.getLstModelObj()[i].cusName[i]);
            System.out.println(ecmEntity);
        }
    }
}
