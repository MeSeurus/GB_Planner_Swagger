package com.planner.web.core.mapper;

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
public class DayMapper {

    private final EventMapper eventMapper;

    public Day dtoToEntity(DayDto dayDto) {
        return new Day(dayDto.getId(), dayDto.getDate(), dayDto.getWeekday());
    }

    public DayDto entityToDto(Day day) {
        return new DayDto(day.getId(), day.getDate(), day.getWeekday());
    }


}
