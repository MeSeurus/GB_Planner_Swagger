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
        throw new UnsupportedOperationException();
    }

    public EventDto entityToDto(Event event) {
        return new EventDto(event.getId(), event.getTitle(), event.getContent(), event.getDay(), event.getEventStart(), event.getEventEnd());
    }

}
