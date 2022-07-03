package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.List;

public class EventDto {

    private Long id;

    private String title;

    private String content;

    private String dayName;

    private LocalDateTime eventStart;

    private LocalDateTime eventEnd;

    public EventDto(Long id, String title, String content, String dayName, LocalDateTime eventStart, LocalDateTime eventEnd) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dayName = dayName;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
    }

    public EventDto(Long id, String title, String content, String dayName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dayName = dayName;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }
}
