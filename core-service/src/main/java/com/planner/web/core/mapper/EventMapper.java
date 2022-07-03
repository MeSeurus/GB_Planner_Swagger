package com.planner.web.core.mapper;

import com.planner.web.core.dto.EventDto;
import com.planner.web.core.entities.Event;
import org.springframework.stereotype.Component;


@Component
public class EventMapper {

    public Event dtoToEntity(EventDto eventDto) {
        throw new UnsupportedOperationException();
    }

    public EventDto entityToDto(Event event) {
        return new EventDto(event.getId(), event.getTitle(), event.getContent(), event.getDay().getWeekday(), event.getEventStart(), event.getEventEnd());
    }

}
