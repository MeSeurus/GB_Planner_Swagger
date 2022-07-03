package com.planner.web.core.converters;

import com.planner.web.core.dto.UserDto;
import com.planner.web.core.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User dtoToEntity(UserDto userDto) {
        return new User(userDto.getNickname());
    }

    public UserDto entityToDto(User user) {
        return new UserDto(user.getNickname());
    }

    public UserDto entityToDtoWithEvents(User user) {
        return new UserDto(user.getId(), user.getNickname(), user.getEvents());
    }

}
