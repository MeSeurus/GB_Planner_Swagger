package com.planner.web.core.services;

import com.planner.web.core.dto.EventDetails;
import com.planner.web.core.entities.Event;
import com.planner.web.core.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public List<Event> findAllByDay(Long dayId) {
        return eventRepository.findAllByDay(dayId);
    }

    public List<Event> findAllByUsername(String username) {
        return eventRepository.findAllByUserNames(username);
    }

    public void createEvent(List<String> userNames, EventDetails eventDetails) {
        Event event = Event.builder()
                .name(eventDetails.getName())
                .content(eventDetails.getContent())
                .userNames(userNames)
                .day(eventDetails.getDay())
                .build();
        eventRepository.save(event);
    }
}
