package com.vcii.demo;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;

@Data
public class Book {
    @SerializedName("title")
    private String title;

    @SerializedName("authors")
    private String[] authors;

    @SerializedName("isbn-10")
    private String isbn10;

    @SerializedName("isbn-13")
    private String isbn13;

    @SerializedName("price")
    private Double price;

    @SerializedName("publishedDate")
    private Date publishedDate;

    public Book() {
    }

    public Book(String title, String[] authors, String isbn10, String isbn13, Double price, Date publishedDate) {
        this.title = title;
        this.authors = authors;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.price = price;
        this.publishedDate = publishedDate;
    }

}
