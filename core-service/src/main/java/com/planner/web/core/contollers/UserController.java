package com.planner.web.core.contollers;

import com.planner.web.api.exceptions.ResourceNotFoundException;
import com.planner.web.core.converters.UserConverter;
import com.planner.web.core.dto.UserDto;
import com.planner.web.core.entities.User;
import com.planner.web.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserConverter userConverter;

    @PostMapping
    public void createNew(@RequestHeader String nickname) {
        userService.createNew(nickname);
    }

    @GetMapping("/{nickname}")
    public UserDto getByNickname(@PathVariable String nickname) {
        User user = userService.findUserByUsername(nickname).orElseThrow(() -> new ResourceNotFoundException("User not found, nickname = " + nickname));
        return userConverter.entityToDto(user);
    }

    @GetMapping
    public List<User> findAllWithEvents() {
        return userService.findAllWithEvents();
//        return userService.findAllWithEvents().stream().map(u -> userConverter.entityToDtoWithEvents(u)).collect(Collectors.toList());
    }



}
