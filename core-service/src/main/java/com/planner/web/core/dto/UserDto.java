package com.planner.web.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@Schema(description = "Модель пользователя")
public class UserDto {
    @Schema(description = "ID пользователя", required = true, example = "1")
    private Long id;

    @Schema(description = "Имя пользователя", required = true, example = "user1")
    private String nickname;

    @Schema(description = "Список событий пользователя", required = false)
    private List<EventDto> eventList;

    public UserDto(String nickname) {
        this.nickname = nickname;
    }

    public UserDto(Long id, String nickname, List<EventDto> eventList) {
        this.id = id;
        this.nickname = nickname;
        this.eventList = eventList;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<EventDto> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventDto> eventList) {
        this.eventList = eventList;
    }
}
