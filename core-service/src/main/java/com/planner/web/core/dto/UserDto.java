package com.planner.web.core.dto;

import com.planner.web.core.entities.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String nickname;
    private List<Event> eventList;

    public UserDto(String nickname) {
        this.nickname = nickname;
    }
}
