package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;

import java.util.List;

public class EventDto {

    private Long id;

    private String title;

    private String content;

    private List<UserDto> usernameList;

    private Day day;

    public EventDto(Long id, String title, String content, List<UserDto> usernameList, Day day) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.usernameList = usernameList;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<UserDto> getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(List<UserDto> usernameList) {
        this.usernameList = usernameList;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
