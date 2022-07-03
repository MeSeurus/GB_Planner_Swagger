package com.planner.web.core.contollers;

import com.planner.web.core.converters.EventConverter;
import com.planner.web.core.dto.EventDetails;
import com.planner.web.core.dto.EventDto;
import com.planner.web.core.entities.User;
import com.planner.web.core.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;
    private final EventConverter eventConverter;

    @GetMapping()
    public List<EventDto> findAll() {
        return eventService.findAll().stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/day/{id}")
    public List<EventDto> findEventsByDayId(@PathVariable Long id) {
        return eventService.findEventsByDayId(id).stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
    }

    /**
     * пока через PathVariable для простоты отладки через постман без фронта
     * todo переделать на RequestHeader
     */
    @GetMapping("/username/{username}")
    public List<EventDto> findEventsByUsername(@PathVariable String username) {
        return eventService.findAllByUsername(username).stream().map(e -> eventConverter.entityToDto(e)).collect(Collectors.toList());
    }

    @PostMapping()
    public void createEvent(@RequestHeader List<String> usernameList, @RequestBody EventDetails eventDetails) {
        eventService.createEvent(usernameList, eventDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteDyId(@PathVariable Long id) {
        eventService.deleteById(id);
    }


}
