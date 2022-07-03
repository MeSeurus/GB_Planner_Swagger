package com.planner.web.core.converters;

import com.planner.web.core.dto.DayDto;
import com.planner.web.core.entities.Day;
import com.planner.web.core.entities.Event;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DayConverter {

    public Day dtoToEntity(DayDto dayDto) {
        throw new UnsupportedOperationException();
    }

    public DayDto entityToDto(Day day) {
        return new DayDto(day.getId(), day.getDate(), day.getWeekday());
    }

}
