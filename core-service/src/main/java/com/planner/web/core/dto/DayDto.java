package com.planner.web.core.dto;

import com.planner.web.core.entities.Event;

import java.util.Date;
import java.util.List;

public class DayDto {

    private Long id;

    private Date date;

    private String weekday;

    private List<Event> events;

    public DayDto(Long id, Date date, String weekday, List<Event> events) {
        this.id = id;
        this.date = date;
        this.weekday = weekday;
        this.events = events;
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

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
