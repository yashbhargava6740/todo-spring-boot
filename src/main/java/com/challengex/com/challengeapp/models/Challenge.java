package com.challengex.com.challengeapp.models;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Challenge {
    private Long id;
    private String name;
    private String description;
    private String month;

    private static Long primaryId = 0L;

    public Challenge(String name, String description, String month) {
        this.id = ++primaryId;
        this.name = name;
        this.description = description;
        this.month = month;
    }

    @JsonGetter("id")
    public Long getId() {
        return this.id;
    }
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter("month")
    public String getMonth() {
        return this.month;
    }
    @JsonSetter("month")
    public void setMonth(String month) {
        this.month = month;
    }
}
