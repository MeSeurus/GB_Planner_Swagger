package com.planner.web.core.converters;

import com.planner.web.core.dto.EventDto;
import com.planner.web.core.entities.Event;

public class EventConverter {

    public Event dtoToEntity(EventDto eventDto) {
        return new Event(eventDto.getId(), eventDto.getName(), eventDto.getContent(), eventDto.getUserNames(), eventDto.getDay());
    }

    public EventDto entityToDto(Event event) {
        return new EventDto(event.getId(), event.getName(), event.getContent(), event.getUserNames(), event.getDay());
    }

}
