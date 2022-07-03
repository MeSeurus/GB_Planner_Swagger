package com.planner.web.core.converters;

import com.planner.web.core.dto.DayDto;
import com.planner.web.core.dto.EventDto;
import com.planner.web.core.entities.Day;
import com.planner.web.core.entities.Event;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class DayConverter {

    private final EventConverter eventConverter;

    public Day dtoToEntity(DayDto dayDto) {
        List<Event> eventDtos = dayDto.getEvents().stream().map(e -> eventConverter.dtoToEntity(e)).collect(Collectors.toList());
        return new Day(dayDto.getId(), dayDto.getDate(), dayDto.getWeekday(), eventDtos);
    }

    public DayDto entityToDto(Day day) {
        List<EventDto> eventDtos = day.getEvents().stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
        return new DayDto(day.getId(), day.getDate(), day.getWeekday(), eventDtos);
    }


}
