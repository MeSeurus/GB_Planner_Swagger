package com.planner.web.core.contollers;

import com.planner.web.core.converters.EventConverter;
import com.planner.web.core.dto.EventDto;
import com.planner.web.core.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;
    private final EventConverter eventConverter;

    public List<EventDto> findAllByDay(Long dayId) {
        return eventService.findAllByDay(dayId).stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
    }

    public List<EventDto> findAllByUsername(String username) {
        return eventService.findAllByUsername(username).stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
    }



}
