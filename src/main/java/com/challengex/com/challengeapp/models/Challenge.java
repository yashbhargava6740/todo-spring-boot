package com.challengex.com.challengeapp.models;

public class Challenge {
    private Long id;
    private String name;
    private String description;
    private String month;

    public Challenge(Long id, String name, String description, String month) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.month = month;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMonth() {
        return this.month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
}
