package com.example.interviewquizeprayer;

public class Prayerdetails {
    String title,description;
    public Prayerdetails(){

    };
    public Prayerdetails(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
