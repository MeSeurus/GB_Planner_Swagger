package com.planner.web.core.services;

import com.planner.web.api.exceptions.ResourceNotFoundException;
import com.planner.web.core.dto.EventDetails;
import com.planner.web.core.entities.Event;
import com.planner.web.core.entities.User;
import com.planner.web.core.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final UserService userService;

    public List<Event> findEventsByDayId(Long dayId) {
        return eventRepository.findAllByDayId(dayId);
    }

    public List<Event> findAllByUsername(String username) {
        User user =  userService.findUserByUsername(username).orElseThrow(() -> new ResourceNotFoundException("User not found, nickname = " + username));
        return eventRepository.findEventsByUsers(user);
    }

    public void createEvent(List<String> usernameList, EventDetails eventDetails) {
        List<User> users = usernameList.stream().map(u -> new User(u)).collect(Collectors.toList());
        Event event = Event.builder()
                .title(eventDetails.getName())
                .content(eventDetails.getContent())
                .users(users)
                .day(eventDetails.getDay())
                .build();
        eventRepository.save(event);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
