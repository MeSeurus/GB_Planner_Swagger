package com.planner.web.core.dto;

import com.planner.web.core.entities.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String nickname;
    private List<EventDto> eventList;

    public UserDto(String nickname) {
        this.nickname = nickname;
    }


}
