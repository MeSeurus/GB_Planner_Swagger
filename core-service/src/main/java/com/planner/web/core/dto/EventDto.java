package com.planner.web.core.dto;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Модель события")
public class EventDto {
    @Schema(description = "ID события", required = true, example = "1")
    private Long id;
    @Schema(description = "Название события", required = true, example = "Создать программу Hello World")
    private String title;

    @Schema(description = "Описание события", required = true)
    private String content;

    @Schema(description = "День недели", required = true, example = "Friday")
    private String dayName;

    /**
     * Вот тут вопрос, событие на один день или на несколько?
     * Если на один, то смысла не имеет, можно дату создания запоминать просто
     */
    @Schema(description = "Дата начала события", required = true)
    private LocalDateTime eventStart;

    @Schema(description = "Дата окончания события", required = true)
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
