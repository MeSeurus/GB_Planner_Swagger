package com.planner.web.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.List;

@Schema(description = "Модель дня")
public class DayDto {
    @Schema(description = "ID дня", required = true, example = "1")
    private Long id;
    @Schema(description = "Дата", required = true, example = "2022-06-24")
    private Date date;
    @Schema(description = "День недели", required = true, example = "Friday")
    private String weekday;


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

}
