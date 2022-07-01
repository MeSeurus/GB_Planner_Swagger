package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;
import lombok.Data;

import java.util.List;

public class EventDetails {

    private String name;
    private String content;
    private List<String> userNames;
    private Day day;

    public EventDetails(String name, String content, List<String> userNames, Day day) {
        this.name = name;
        this.content = content;
        this.userNames = userNames;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
