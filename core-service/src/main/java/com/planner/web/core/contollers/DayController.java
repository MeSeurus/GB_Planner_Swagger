package com.planner.web.core.contollers;

import com.planner.web.api.exceptions.ResourceNotFoundException;
import com.planner.web.core.converters.DayConverter;
import com.planner.web.core.dto.DayDto;
import com.planner.web.core.entities.Day;
import com.planner.web.core.services.DayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/days")
@RequiredArgsConstructor
public class DayController {

    private final DayService dayService;
    private final DayConverter dayConverter;

    @GetMapping
    public List<DayDto> findAll() {
        return dayService.findAll().stream().map(d -> dayConverter.entityToDto(d)).collect(Collectors.toList());
    }

    @GetMapping("/id")
    public DayDto findById(@PathVariable Long id) {
        return dayConverter.entityToDto(dayService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Day not found, day id = " + id)));
    }

    @PostMapping
    public void createNew(@RequestHeader DayDto dayDto) {
        Day day = dayConverter.dtoToEntity(dayDto);
        dayService.createNew(day);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        dayService.deleteById(id);
    }


}
