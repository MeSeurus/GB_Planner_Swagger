package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;

import java.util.List;

public class EventDto {

    private Long id;

    private String name;

    private String content;

    private List<String> userNames;

    private Day day;

    public EventDto(Long id, String name, String content, List<String> userNames, Day day) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.userNames = userNames;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
