package com.example.project;

import com.google.gson.annotations.SerializedName;

public class audio {

    @SerializedName("title")
    private String name;

    @SerializedName("singger")
    private String singger;

    @SerializedName("id")
    private int id;

    @SerializedName("content")
    private String content;

    @SerializedName("create_at")
    private String time_up;

    public audio(String name, String singger, int id, String content, String time_up) {
        this.name = name;
        this.singger = singger;
        this.id = id;
        this.content = content;
        this.time_up = time_up;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingger() {
        return singger;
    }

    public void setSingger(String singger) {
        this.singger = singger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime_up() {
        return time_up;
    }

    public void setTime_up(String time_up) {
        this.time_up = time_up;
    }
}
