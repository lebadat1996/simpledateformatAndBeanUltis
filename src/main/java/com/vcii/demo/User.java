package com.vcii.demo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class User {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("date")
    private Date createDate;

    public User() {
    }

    public User(int id, String name, String username, String password, Date createDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
    }
}
