package com.planner.web.core.dto;

import com.planner.web.core.entities.Day;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "Модель деталей события")
public class EventDetails {
    @Schema(description = "Название события", required = true)
    private String title;
    @Schema(description = "Описание события", required = true)
    private String content;
    @Schema(description = "Список пользователей", required = false)
    private List<String> userNames;

    @Schema(description = "День события", required = true)
    private Day day;

    public EventDetails(String title, String content, List<String> userNames, Day day) {
        this.title = title;
        this.content = content;
        this.userNames = userNames;
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
