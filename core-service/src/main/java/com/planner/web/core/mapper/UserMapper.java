package com.planner.web.core.mapper;

import com.planner.web.core.dto.EventDto;
import com.planner.web.core.dto.UserDto;
import com.planner.web.core.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User dtoToEntity(UserDto userDto) {
        return new User(userDto.getNickname());
    }

    public UserDto entityToDto(User user) {
        return new UserDto(user.getNickname());
    }

    public UserDto entityToDtoWithEvents(User user) {
        List<EventDto> eventDtos = user.getEvents().stream().
                map(e -> new EventDto(e.getId(), e.getTitle(), e.getContent(), e.getDay().getWeekday())).collect(Collectors.toList());
        return new UserDto(user.getId(), user.getNickname(), eventDtos);
    }

}
