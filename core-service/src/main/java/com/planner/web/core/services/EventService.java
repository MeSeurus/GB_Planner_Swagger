package com.planner.web.core.services;

import com.planner.web.core.dto.EventDetails;
import com.planner.web.core.entities.Event;
import com.planner.web.core.entities.User;
import com.planner.web.core.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public List<Event> findEventsByDayId(Long dayId) {
        return eventRepository.findAllByDayId(dayId);
    }

    public List<Event> findAllByUsername(String username) {
        return eventRepository.findAllByUsernameList(username);
    }

    public void createEvent(List<String> usernameList, EventDetails eventDetails) {
        List<User> users = usernameList.stream().map(u -> new User(u)).collect(Collectors.toList());
        Event event = Event.builder()
                .title(eventDetails.getName())
                .content(eventDetails.getContent())
                .usernameList(users)
                .day(eventDetails.getDay())
                .build();
        eventRepository.save(event);
    }
}
