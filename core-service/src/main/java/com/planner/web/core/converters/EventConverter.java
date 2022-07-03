package com.planner.web.core.converters;

import com.planner.web.core.dto.EventDto;
import com.planner.web.core.dto.UserDto;
import com.planner.web.core.entities.Event;
import com.planner.web.core.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventConverter {

    public Event dtoToEntity(EventDto eventDto) {
        List<User> users = eventDto.getUsernameList().stream().map(u -> new User(u.getNickname())).collect(Collectors.toList());
        return new Event(eventDto.getId(), eventDto.getTitle(), eventDto.getContent(), users, eventDto.getDay());
    }

    public EventDto entityToDto(Event event) {
        List<UserDto> usersDto = event.getUsernameList().stream().map(u -> new UserDto(u.getNickname())).collect(Collectors.toList());
        return new EventDto(event.getId(), event.getTitle(), event.getContent(), usersDto, event.getDay());
    }

}
