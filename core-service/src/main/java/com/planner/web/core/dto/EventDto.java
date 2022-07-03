package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.List;

public class EventDto {

    private Long id;

    private String title;

    private String content;

    private Day day;

    private LocalDateTime eventStart;

    private LocalDateTime eventEnd;

    public EventDto(Long id, String title, String content, Day day, LocalDateTime eventStart, LocalDateTime eventEnd) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.day = day;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
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

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
