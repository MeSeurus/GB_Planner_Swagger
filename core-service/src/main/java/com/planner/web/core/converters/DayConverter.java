package com.planner.web.core.converters;

import com.planner.web.core.dto.DayDto;
import com.planner.web.core.entities.Day;
import org.springframework.stereotype.Component;

@Component
public class DayConverter {

    public Day dtoToEntity(DayDto dayDto) {
        return new Day(dayDto.getId(), dayDto.getDate(), dayDto.getWeekday());
    }

    public DayDto entityToDto(Day day) {
        return new DayDto(day.getId(), day.getDate(), day.getWeekday());
    }

}
