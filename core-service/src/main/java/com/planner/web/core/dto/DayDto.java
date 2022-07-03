package com.planner.web.core.dto;

import com.planner.web.core.entities.Event;

import java.util.Date;
import java.util.List;

public class DayDto {
    private Long id;
    private Date date;
    private String weekday;

    private List<EventDto> events;

    public DayDto(Long id, Date date, String weekday, List<EventDto> events) {
        this.id = id;
        this.date = date;
        this.weekday = weekday;
        this.events = events;
    }

    public DayDto(Long id, Date date, String weekday) {
        this.id = id;
        this.date = date;
        this.weekday = weekday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public List<EventDto> getEvents() {
        return events;
    }

    public void setEvents(List<EventDto> events) {
        this.events = events;
    }
}
